package GUI.GUI_BoxLook_New_25072020.MethodLibrary.MethodsLibrary.VI_Clear_TracesAndCharts;

import GUI.GUI_BoxLook_New_25072020.GUIComponents.GUIComponents;
import GUI.GUI_BoxLook_New_25072020.Variables.Variables;

public class Clear_TracesAndCharts extends Clear_TracesAndCharts_abstract {

    /*** ---------------------------------------------------------------------------------------------------------* */
    public Clear_TracesAndCharts(){}

    public Clear_TracesAndCharts(GUIComponents aGUIComponents, Variables aVariables){
        initialize(aGUIComponents, aVariables);
    }

    public void initialize(GUIComponents aGUIComponents, Variables aVariables){
        initializeReferenceParameters(aGUIComponents, aVariables);
    }

    /*** ---------------------------------------------------------------------------------------------------------* */
    /*** ---------------------------------------------------------------------------------------------------------* */

    /*---------------------------------------------------------------

     **             removeAllTracePoints_centerChart()               **

     ******************************************************************/
    public void removeAllPoints_centerChart(){
        /*** set back to default scale **/
        setScale();

        this.aVariables.TSDotTrace.removeAllPoints();
        /*
        interpolatedTSMark_centerChart.removeAllPoints();
        */
        if(getLoadShapeletYesOrNo()){
            removePointsCenterChart(); // Clear local trace point locally
            removePointsTopRightChart(); // Clear local trace point locally
        }
    }

    /*---------------------------------------------------------------

     **                 removeAllTraces_topRightChart()            **

     ******************************************************************/
    public void removeAllTraces_topRightShapeletChart(){
        this.aVariables.topRightShapeletChart.removeAllTraces();
    }

    public void removeAllTraceTopRightTimeseriesChart(){
        this.aVariables.topRightTimeseriesChart.removeAllTraces();
    }

    /*---------------------------------------------------------------

     **                 removeMultiTraces()            **

     ******************************************************************/
    public void removeMultiTraces(){
        int defaultTopK = 10;
        for(int i=0; i<defaultTopK; i++){
            this.aVariables.multiCharts[i].removeAllTraces();
        }
    }

    /*---------------------------------------------------------------

     **                removeAllTraces_centerChart()                 **

     ******************************************************************/
    public void removeAllTraces_centerChart(){
        /*** set back to default scale **/
        setScale();
        this.aVariables.centerChart.removeAllTraces();
    }

    /*---------------------------------------------------------------

     **               removeAllTraces_BottomChart()                  **

     ******************************************************************/
    public void removeAllTraces_BottomChart(){
        /*** set back to default scale **/
        setScale();
        this.aVariables.bottomChart.removeAllTraces();
//        System.out.println("-> Cleared AllTimeSeriesInChart_II!");
    }

    /*---------------------------------------------------------------

     **                   clearAllTSTraces_AllCharts()               **

     ******************************************************************/
    public void clearAllTSTraces_AllCharts(){
        /*** set back to default scale **/
        setScale();
        /*** Clear stack model shapelet index storage **/
        /*** **/
        removeAllPoints_centerChart();
        removeAllTraces_centerChart();
        /*** **/
        removeAllTraces_BottomChart();
        /*** **/
        if(getLoadShapeletYesOrNo()){
            removeAllTraces_topRightShapeletChart();
        }
        /*** **/
        removeMultiTraces();
        /*** **/
        /*** **/
        System.out.println("-> Cleared AllTimeSeries!");
    }

    /*** ---------------------------------------------------------------------------------------------------------* */

    /*---------------------------------------------------------------

     **                    addTraceBack_centerChart()                 **

     ******************************************************************/
    public void addTraceBack_topRightChart() {
        localAddTraceBack_topRightChart();
    }

    /*---------------------------------------------------------------

     **                    addTraceBack_centerChart()                 **

     ******************************************************************/
    public void addTraceBack_pointsKept_centerChart() {
        localAddTraceBack__pointsKept_centerChart();
    }

    /*---------------------------------------------------------------

     **                    addTraceBack_centerChart()                 **

     ******************************************************************/
    public void aadTraceBack__pointsRemoved_centerChart() {
        localAddTraceBack_pointsRemoved_centerChart();
    }

    /*---------------------------------------------------------------

     **                    addTraceBack_centerChart()                 **

     ******************************************************************/
    public void addTraceBack_bottomChart() {
        localAddTraceBack_bottomChart();
    }

    /*---------------------------------------------------------------

     **                      addAllTraceBack()                      **

     ******************************************************************/
    public void addAllTraceBack(){
        addTraceBack_topRightChart();
        addTraceBack_pointsKept_centerChart();
        addTraceBack_bottomChart();
    }

    public void btnClearAll_addBack(){
        addTraceBack_topRightChart();
        aadTraceBack__pointsRemoved_centerChart();
        addTraceBack_bottomChart();
    }
}