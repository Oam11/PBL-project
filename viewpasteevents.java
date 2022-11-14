import '../flutter_flow/flutter_flow_animations.dart';
import '../flutter_flow/flutter_flow_icon_button.dart';
import '../flutter_flow/flutter_flow_theme.dart';
import '../flutter_flow/flutter_flow_util.dart';
import '../flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:flutter/scheduler.dart';
import 'package:flutter_animate/flutter_animate.dart';
import 'package:google_fonts/google_fonts.dart';

class ViewpasteventsWidget extends StatefulWidget {
  const ViewpasteventsWidget({Key? key}) : super(key: key);

  @override
  _ViewpasteventsWidgetState createState() => _ViewpasteventsWidgetState();
}

class _ViewpasteventsWidgetState extends State<ViewpasteventsWidget>
    with TickerProviderStateMixin {
  final scaffoldKey = GlobalKey<ScaffoldState>();
  var hasDrawerTriggered = false;
  final animationsMap = {
    'containerOnPageLoadAnimation1': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 1110.ms,
          begin: Offset(100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
    'containerOnPageLoadAnimation2': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 1100.ms,
          begin: Offset(-100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
    'containerOnPageLoadAnimation3': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 1100.ms,
          begin: Offset(100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
    'containerOnPageLoadAnimation4': AnimationInfo(
      trigger: AnimationTrigger.onPageLoad,
      effects: [
        MoveEffect(
          curve: Curves.easeInOut,
          delay: 0.ms,
          duration: 1100.ms,
          begin: Offset(-100, 0),
          end: Offset(0, 0),
        ),
      ],
    ),
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
      backgroundColor: Colors.white,
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
          child: Column(
            mainAxisSize: MainAxisSize.max,
            children: [
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(35, 30, 0, 0),
                child: InkWell(
                  onTap: () async {
                    await launchURL(
                        'https://acrobat.adobe.com/link/track?uri=urn:aaid:scds:US:6d16190f-3269-37a5-a2b4-7f74127b7750');
                  },
                  child: Material(
                    color: Colors.transparent,
                    elevation: 4,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(13),
                    ),
                    child: Container(
                      width: 300,
                      height: 50,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).secondaryBackground,
                        boxShadow: [
                          BoxShadow(
                            blurRadius: 4,
                            color: Color(0x33000000),
                            offset: Offset(2, 2),
                            spreadRadius: 2,
                          )
                        ],
                        borderRadius: BorderRadius.circular(13),
                      ),
                      child: Stack(
                        children: [
                          Align(
                            alignment: AlignmentDirectional(0.03, 0.26),
                            child: SelectionArea(
                                child: Text(
                              '2017-2018',
                              style:
                                  FlutterFlowTheme.of(context).title1.override(
                                        fontFamily: 'Poppins',
                                        color: Color(0xFFBC0001),
                                        fontWeight: FontWeight.bold,
                                      ),
                            )),
                          ),
                        ],
                      ),
                    ),
                  ),
                ).animateOnPageLoad(
                    animationsMap['containerOnPageLoadAnimation1']!),
              ),
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(35, 30, 0, 0),
                child: InkWell(
                  onTap: () async {
                    await launchURL(
                        'https://acrobat.adobe.com/link/track?uri=urn:aaid:scds:US:f49fbeef-2d5d-336c-b21a-fc68876d36f8');
                  },
                  child: Material(
                    color: Colors.transparent,
                    elevation: 4,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(13),
                    ),
                    child: Container(
                      width: 300,
                      height: 50,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).secondaryBackground,
                        boxShadow: [
                          BoxShadow(
                            blurRadius: 4,
                            color: Color(0x33000000),
                            offset: Offset(2, 2),
                            spreadRadius: 2,
                          )
                        ],
                        borderRadius: BorderRadius.circular(13),
                      ),
                      child: Stack(
                        children: [
                          Align(
                            alignment: AlignmentDirectional(0.03, 0.26),
                            child: SelectionArea(
                                child: Text(
                              '2018-2019',
                              style:
                                  FlutterFlowTheme.of(context).title1.override(
                                        fontFamily: 'Poppins',
                                        color: Color(0xFFBC0001),
                                        fontWeight: FontWeight.bold,
                                      ),
                            )),
                          ),
                        ],
                      ),
                    ),
                  ),
                ).animateOnPageLoad(
                    animationsMap['containerOnPageLoadAnimation2']!),
              ),
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(35, 30, 0, 0),
                child: InkWell(
                  onTap: () async {
                    await launchURL(
                        'https://acrobat.adobe.com/link/track?uri=urn:aaid:scds:US:fa0c47c7-8b62-31ff-b7b2-c5eda4ee5228');
                  },
                  child: Material(
                    color: Colors.transparent,
                    elevation: 4,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(13),
                    ),
                    child: Container(
                      width: 300,
                      height: 50,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).secondaryBackground,
                        boxShadow: [
                          BoxShadow(
                            blurRadius: 4,
                            color: Color(0x33000000),
                            offset: Offset(2, 2),
                            spreadRadius: 2,
                          )
                        ],
                        borderRadius: BorderRadius.circular(13),
                      ),
                      child: Stack(
                        children: [
                          Align(
                            alignment: AlignmentDirectional(0.03, 0.26),
                            child: SelectionArea(
                                child: Text(
                              '2019-2020',
                              style:
                                  FlutterFlowTheme.of(context).title1.override(
                                        fontFamily: 'Poppins',
                                        color: Color(0xFFBC0001),
                                        fontWeight: FontWeight.bold,
                                      ),
                            )),
                          ),
                        ],
                      ),
                    ),
                  ),
                ).animateOnPageLoad(
                    animationsMap['containerOnPageLoadAnimation3']!),
              ),
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(35, 30, 0, 0),
                child: InkWell(
                  onTap: () async {
                    await launchURL(
                        'https://acrobat.adobe.com/link/track?uri=urn:aaid:scds:US:e53dcff9-1ba0-3ec6-a60d-c0f617f7349f');
                  },
                  child: Material(
                    color: Colors.transparent,
                    elevation: 4,
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(13),
                    ),
                    child: Container(
                      width: 300,
                      height: 50,
                      decoration: BoxDecoration(
                        color: FlutterFlowTheme.of(context).secondaryBackground,
                        boxShadow: [
                          BoxShadow(
                            blurRadius: 4,
                            color: Color(0x33000000),
                            offset: Offset(2, 2),
                            spreadRadius: 2,
                          )
                        ],
                        borderRadius: BorderRadius.circular(13),
                      ),
                      child: Stack(
                        children: [
                          Align(
                            alignment: AlignmentDirectional(0.03, 0.26),
                            child: SelectionArea(
                                child: Text(
                              '2020-2021',
                              style:
                                  FlutterFlowTheme.of(context).title1.override(
                                        fontFamily: 'Poppins',
                                        color: Color(0xFFBC0001),
                                        fontWeight: FontWeight.bold,
                                      ),
                            )),
                          ),
                        ],
                      ),
                    ),
                  ),
                ).animateOnPageLoad(
                    animationsMap['containerOnPageLoadAnimation4']!),
              ),
              Padding(
                padding: EdgeInsetsDirectional.fromSTEB(35, 50, 0, 0),
                child: Image.asset(
                  'assets/images/Untitled111_20220920150311.png',
                  width: 300,
                  height: 300,
                  fit: BoxFit.cover,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
