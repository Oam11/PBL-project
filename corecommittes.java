import '../flutter_flow/flutter_flow_animations.dart';
import '../flutter_flow/flutter_flow_icon_button.dart';
import '../flutter_flow/flutter_flow_pdf_viewer.dart';
import '../flutter_flow/flutter_flow_theme.dart';
import '../flutter_flow/flutter_flow_util.dart';
import '../flutter_flow/flutter_flow_widgets.dart';
import 'package:flutter/material.dart';
import 'package:flutter/scheduler.dart';
import 'package:flutter_animate/flutter_animate.dart';
import 'package:google_fonts/google_fonts.dart';

class CorecommitteesWidget extends StatefulWidget {
  const CorecommitteesWidget({Key? key}) : super(key: key);

  @override
  _CorecommitteesWidgetState createState() => _CorecommitteesWidgetState();
}

class _CorecommitteesWidgetState extends State<CorecommitteesWidget>
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
      backgroundColor: FlutterFlowTheme.of(context).secondaryBackground,
      drawer: Container(
        width: 300,
        child: Drawer(
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
                padding: EdgeInsetsDirectional.fromSTEB(0, 30, 0, 0),
                child: SelectionArea(
                    child: Text(
                  'CORE COMMITTEEE OF NSS',
                  style: FlutterFlowTheme.of(context).title1.override(
                        fontFamily: 'Poppins',
                        color: Color(0xFFBC0001),
                        fontWeight: FontWeight.bold,
                      ),
                )),
              ),
              FlutterFlowPdfViewer(
                assetPath: 'assets/pdfs/1.NSS_committee_(2021-22).docx.pdf',
                height: 600,
                horizontalScroll: false,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
