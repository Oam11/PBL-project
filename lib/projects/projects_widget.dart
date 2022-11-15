import '../flutter_flow/flutter_flow_animations.dart';
import '../flutter_flow/flutter_flow_icon_button.dart';
import '../flutter_flow/flutter_flow_theme.dart';
import '../flutter_flow/flutter_flow_util.dart';
import '../flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:flutter/scheduler.dart';
import 'package:flutter_animate/flutter_animate.dart';
import 'package:google_fonts/google_fonts.dart';

class ProjectsWidget extends StatefulWidget {
  const ProjectsWidget({Key? key}) : super(key: key);

  @override
  _ProjectsWidgetState createState() => _ProjectsWidgetState();
}

class _ProjectsWidgetState extends State<ProjectsWidget>
    with TickerProviderStateMixin {
  final scaffoldKey = GlobalKey<ScaffoldState>();
  var hasDrawerTriggered = false;
  final animationsMap = {
    'drawerOnPageLoadAnimation': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      applyInitialState: false,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: Offset(-100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
    'drawerOnActionTriggerAnimation': AnimationInfo(
      trigger: AnimationTrigger.onActionTrigger,
      applyInitialState: false,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 600.ms,
          begin: Offset(-100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
  };

  @override
  void initState() {
    super.initState();
    setupAnimations(
      animationsMap.values.where((anim) =>
          anim.trigger == AnimationTrigger.onActionTrigger ||
          !anim.applyInitialState),
      this,
    );

    SchedulerBinding.instance.addPostFrameCallback((_) {
      animationsMap['drawerOnPageLoadAnimation']!.controller.forward(from: 0.0);
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      key: scaffoldKey,
      backgroundColor: FlutterFlowTheme.of(context).primaryBackground,
      drawer: Drawer(
        elevation: 10,
        child: Column(
          mainAxisSize: MainAxisSize.max,
          children: [
            Align(
              alignment: AlignmentDirectional(-0.95, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 20, 0, 0),
                child: InkWell(
                  onTap: () async {
                    Navigator.pop(context);
                  },
                  child: Icon(
                    Icons.close,
                    color: Color(0xFFBC0001),
                    size: 30,
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-0.9, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 50, 70, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'HomePage',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'HOME',
                  icon: Icon(
                    Icons.arrow_forward_ios,
                    color: Color(0xFFBC0001),
                    size: 25,
                  ),
                  options: FFButtonOptions(
                    width: 140,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      width: 10,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-0.9, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 15, 60, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'About',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'ABOUT',
                  icon: Icon(
                    Icons.arrow_forward_ios_outlined,
                    size: 15,
                  ),
                  options: FFButtonOptions(
                    width: 150,
                    height: 40,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      color: Colors.transparent,
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-0.85, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 15, 55, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'Notice',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'NOTICE',
                  icon: Icon(
                    Icons.arrow_forward_ios_outlined,
                    size: 15,
                  ),
                  options: FFButtonOptions(
                    width: 150,
                    height: 40,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      color: Colors.transparent,
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-0.85, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 15, 20, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'Projects',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'PROJECTS',
                  icon: Icon(
                    Icons.arrow_forward_ios_outlined,
                    size: 15,
                  ),
                  options: FFButtonOptions(
                    width: 180,
                    height: 40,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      color: Colors.transparent,
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-1, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 15, 20, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'BLOODDONATION',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'BLOOD DONATION',
                  icon: Icon(
                    Icons.arrow_forward_ios_outlined,
                    size: 15,
                  ),
                  options: FFButtonOptions(
                    width: 300,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      color: Colors.transparent,
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
            Align(
              alignment: AlignmentDirectional(-1, 0),
              child: Padding(
                padding: EdgeInsetsDirectional.fromSTEB(0, 15, 0, 0),
                child: FFButtonWidget(
                  onPressed: () async {
                    context.pushNamed(
                      'More',
                      extra: <String, dynamic>{
                        kTransitionInfoKey: TransitionInfo(
                          hasTransition: true,
                          transitionType: PageTransitionType.rightToLeft,
                          duration: Duration(milliseconds: 2),
                        ),
                      },
                    );
                  },
                  text: 'MORE',
                  icon: Icon(
                    Icons.arrow_forward_ios_outlined,
                    size: 15,
                  ),
                  options: FFButtonOptions(
                    width: 140,
                    height: 40,
                    color: Color(0x00FFFFFF),
                    textStyle: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontWeight: FontWeight.bold,
                        ),
                    borderSide: BorderSide(
                      color: Colors.transparent,
                      width: 1,
                    ),
                    borderRadius: BorderRadius.circular(8),
                  ),
                ),
              ),
            ),
          ],
        ),
      )
          .animateOnPageLoad(animationsMap['drawerOnPageLoadAnimation']!)
          .animateOnActionTrigger(
              animationsMap['drawerOnActionTriggerAnimation']!,
              hasBeenTriggered: hasDrawerTriggered),
      appBar: AppBar(
        backgroundColor: FlutterFlowTheme.of(context).primaryColor,
        automaticallyImplyLeading: false,
        leading: Row(
          mainAxisSize: MainAxisSize.max,
          children: [
            FlutterFlowIconButton(
              borderColor: Colors.transparent,
              borderRadius: 30,
              borderWidth: 1,
              buttonSize: 60,
              icon: Icon(
                Icons.dehaze,
                color: Color(0xFFBC0001),
                size: 30,
              ),
              onPressed: () async {
                scaffoldKey.currentState!.openDrawer();
              },
            ),
            Text(
              'KJSIEIT NSS',
              style: FlutterFlowTheme.of(context).title1.override(
                    fontFamily: 'Poppins',
                    color: Color(0xFFBC0001),
                  ),
            ),
            Padding(
              padding: EdgeInsetsDirectional.fromSTEB(100, 0, 0, 0),
              child: Image.asset(
                'assets/images/Untitled111_20220920150311.png',
                width: 60,
                height: 60,
                fit: BoxFit.cover,
              ),
            ),
          ],
        ),
        actions: [],
        centerTitle: false,
        elevation: 2,
      ),
      body: SafeArea(
        child: GestureDetector(
          onTap: () => FocusScope.of(context).unfocus(),
          child: SingleChildScrollView(
            child: Column(
              mainAxisSize: MainAxisSize.max,
              children: [
                Align(
                  alignment: AlignmentDirectional(0.06, -0.96),
                  child: SelectionArea(
                      child: Text(
                    'PROJECTS',
                    style: FlutterFlowTheme.of(context).title1.override(
                          fontFamily: 'Poppins',
                          color: Color(0xFFBC0001),
                          fontSize: 30,
                          fontWeight: FontWeight.bold,
                        ),
                  )),
                ),
                Container(
                  width: 400,
                  height: 750,
                  child: Stack(
                    children: [
                      Align(
                        alignment: AlignmentDirectional(-0.88, -0.94),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_010659.png',
                          width: 200,
                          height: 150,
                          fit: BoxFit.contain,
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(-0.84, -0.96),
                        child: SelectionArea(
                            child: Text(
                          'VILLAGE DONATION DRIVE',
                          style:
                              FlutterFlowTheme.of(context).bodyText1.override(
                                    fontFamily: 'Poppins',
                                    color: Color(0xFF391010),
                                    fontSize: 15,
                                  ),
                        )),
                      ),
                      Align(
                        alignment: AlignmentDirectional(0.95, -0.9),
                        child: Container(
                          width: 150,
                          height: 100,
                          decoration: BoxDecoration(
                            color: Color(0x00FFFFFF),
                          ),
                          child: Column(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              Align(
                                alignment: AlignmentDirectional(0, -0.22),
                                child: SelectionArea(
                                    child: Text(
                                  'The NSS unit of KJSIEIT organized event \"VillageDonation Drive\" to encourage people to be morecharitable and responsible towards the lesserfortunate sections of our society.\nThe NSS volunteers with all the COVIDprecautions carried out the Donation Drive in theirrespective societies and areas, which could bedonated by the people for distribution at theadopted village.',
                                  textAlign: TextAlign.start,
                                  style: FlutterFlowTheme.of(context)
                                      .bodyText1
                                      .override(
                                        fontFamily: 'Poppins',
                                        fontSize: 9,
                                      ),
                                )),
                              ),
                            ],
                          ),
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(-0.54, -0.58),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_011228.png',
                          width: 150,
                          height: 100,
                          fit: BoxFit.contain,
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(-0.75, 0.08),
                        child: SelectionArea(
                            child: Text(
                          'BEACH CLEANUP DRIVE',
                          style:
                              FlutterFlowTheme.of(context).bodyText1.override(
                                    fontFamily: 'Poppins',
                                    color: Color(0xFF391010),
                                    fontSize: 15,
                                  ),
                        )),
                      ),
                      Align(
                        alignment: AlignmentDirectional(0, -0.3),
                        child: Container(
                          width: 370,
                          height: 100,
                          decoration: BoxDecoration(
                            color: Color(0x00FFFFFF),
                          ),
                          child: Column(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              Align(
                                alignment: AlignmentDirectional(0, -0.25),
                                child: Padding(
                                  padding: EdgeInsetsDirectional.fromSTEB(
                                      2, 0, 2, 0),
                                  child: SelectionArea(
                                      child: Text(
                                    'On Arriving in the village on 12th March, the NSS volunteers gathered in the Community Hall andsegregated all the items. The villagers then collected items which they found beneficial in anorderly manner. The villagers were extremely grateful. On the same day, the NSS unit of KJSIEITorganized an event “Chaffewadi Sanitary Pads Awareness and Distribution” to spread awarenessabout menstrual hygiene among women and girls of the village. This event was conducted incollaboration with Umang Foundation who donated sanitary pads. The NSS unit of KJSIEIT organized an event \"Village Survey”. The drive ended on a successful notewith each volunteer collecting considerable number of clothes, books and other items and thensuccessfully donating them to the villagers.',
                                    textAlign: TextAlign.start,
                                    style: FlutterFlowTheme.of(context)
                                        .bodyText1
                                        .override(
                                          fontFamily: 'Poppins',
                                          fontSize: 9,
                                        ),
                                  )),
                                ),
                              ),
                            ],
                          ),
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(0, 0.95),
                        child: Container(
                          width: 370,
                          height: 100,
                          decoration: BoxDecoration(
                            color: Color(0x00FFFFFF),
                          ),
                          child: Column(
                            mainAxisSize: MainAxisSize.max,
                            children: [
                              Align(
                                alignment: AlignmentDirectional(0, 0.81),
                                child: SelectionArea(
                                    child: Text(
                                  'Ever since the month of August the NSS unitof KJSIEIT organized various \"Cleanup\"events like the Chowpatty and Juhu Beach,Thane park, Kandivali Swacchta Abhyan andmany more. These events were conductedunder covid guidance and with assistance ofthe local authorities. They started around8:00am in the morning. The event wasorganized by Prof. Pankaj V. Deshmukh, NSSProgramme officer at KJSIEIT.',
                                  style: FlutterFlowTheme.of(context)
                                      .bodyText1
                                      .override(
                                        fontFamily: 'Poppins',
                                        fontSize: 11,
                                      ),
                                )),
                              ),
                            ],
                          ),
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(-0.91, 0.3),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_012207.png',
                          width: 200,
                          height: 100,
                          fit: BoxFit.contain,
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(0.89, 0.62),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_012225.png',
                          width: 200,
                          height: 100,
                          fit: BoxFit.contain,
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(0.58, 0.28),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_012242.png',
                          width: 100,
                          height: 100,
                          fit: BoxFit.contain,
                        ),
                      ),
                      Align(
                        alignment: AlignmentDirectional(-0.59, 0.62),
                        child: Image.asset(
                          'assets/images/Screenshot_2022-11-11_012300.png',
                          width: 100,
                          height: 100,
                          fit: BoxFit.cover,
                        ),
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
