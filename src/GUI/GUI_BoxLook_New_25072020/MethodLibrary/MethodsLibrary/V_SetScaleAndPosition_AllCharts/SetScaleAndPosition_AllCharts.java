package GUI.GUI_BoxLook_New_25072020.MethodLibrary.MethodsLibrary.V_SetScaleAndPosition_AllCharts;

import GUI.GUI_BoxLook_New_25072020.GUIComponents.GUIComponents;
import GUI.GUI_BoxLook_New_25072020.Variables.Variables;
import info.monitorenter.gui.chart.rangepolicies.RangePolicyFixedViewport;
import info.monitorenter.util.Range;

public class SetScaleAndPosition_AllCharts extends SetScaleAndPosition_AllCharts_abstract {

    /*** ---------------------------------------------------------------------------------------------------------* */
    public SetScaleAndPosition_AllCharts(){}

    public SetScaleAndPosition_AllCharts(GUIComponents aGUIComponents, Variables aVariables){
        initialize(aGUIComponents, aVariables);
    }

    public void initialize(GUIComponents aGUIComponents, Variables aVariables){
        initializeReferenceParameters(aGUIComponents, aVariables);
        firstCallTimeseries_centerChart = true;
        firstCallTimeseries_bottomChart = true;
        firstCallShapelet = true;
        globalTimeseriesMin = Double.POSITIVE_INFINITY;
        globalTimeseriesMax = Double.NEGATIVE_INFINITY;
    }

    /*---------------------------------------------------------------

     **                       setScale()                              **

     ---------------------------------------------------------------*/
    public void setScale(double scale){
        double myScale = scale - this.aVariables.oldScale;
        double xL = this.aVariables.centerChartXL;
        double xR = this.aVariables.centerChartXR;
        double myWidth = this.aVariables.centerChartWidth;

        this.aVariables.centerChart.getAxisX().setRange(new Range(xL += myWidth * myScale/2, xR -= myWidth * myScale/2));

        this.aVariables.centerChartXL = xL;
        this.aVariables.centerChartXR = xR;

        this.aVariables.oldScale = scale;
    }

    /*---------------------------------------------------------------

     **              timeSeriesSlideZoomCenterChart()              **

     ---------------------------------------------------------------*/
    public void timeSeriesSlideZoomCenterChart(int val){
        if(firstCallTimeseries_centerChart){
            firstCallTimeseries_centerChart = false;
            this.aVariables.centerChart.getAxisY().setRangePolicy( new RangePolicyFixedViewport());
        }

        int minBound = this.aGUIComponents.zoomSliderCenterChart.getMinimum();
        int maxBound = this.aGUIComponents.zoomSliderCenterChart.getMaximum();

        if(val>=maxBound){
            return; // Prevent approaching the upper bound since ratio = 0 when val = 10
        }

        double ratio = 1 - val*1.0/(maxBound-minBound);
        double powRatio = Math.pow(ratio, val+1); // val starts from 0
        double[] minMaxTimeseries = this.aVariables.minMaxTimeSeriesDataset;
        double[] minMaxShapelet = this.aVariables.minMaxShapeletDataset;
        double aMin;
        double aMax;

        if(minMaxShapelet[0]<minMaxTimeseries[0]){
            aMin = minMaxShapelet[0]-1; // Leave some spaces on the bottom
        }else{
            aMin = minMaxTimeseries[0]-1; // Leave some spaces on the bottom
        }

        if(minMaxShapelet[1]>minMaxTimeseries[1]){
            aMax = minMaxShapelet[1]+1; // Leave some spaces on the bottom
        }else{
            aMax = minMaxTimeseries[1]+1; // Leave some spaces on the bottom
        }

        this.aVariables.centerChart.getAxisY().setRange(new Range(aMin, aMax*powRatio));
//        System.out.println("minMax: " + minBound + ", " + maxBound);
    }

    /*---------------------------------------------------------------

     **              timeSeriesSlideZoomBottomChart()              **

     ---------------------------------------------------------------*/
    public void timeSeriesSlideZoomBottomChart(int val){
        if(firstCallTimeseries_bottomChart){
            firstCallTimeseries_bottomChart = false;
            this.aVariables.bottomChart.getAxisY().setRangePolicy( new RangePolicyFixedViewport());
        }

        int minBound = this.aGUIComponents.zoomSliderBottomChart.getMinimum();
        int maxBound = this.aGUIComponents.zoomSliderBottomChart.getMaximum();

        if(val>=maxBound){
            return; // Prevent approaching the upper bound since ratio = 0 when val = 10
        }

        double ratio = 1 - val*1.0/(maxBound-minBound);
        double powRatio = Math.pow(ratio, val+1); // val starts from 0
        double[] minMaxTimeseries = this.aVariables.minMaxTimeSeriesDataset;
        double aMin;
        double aMax;

        if(minMaxTimeseries[0]<globalTimeseriesMin){
            globalTimeseriesMin = minMaxTimeseries[0];
            aMin = minMaxTimeseries[0]-1; // Leave some spaces on the bottom
        }else{
            aMin = globalTimeseriesMin-1;
        }

        if(minMaxTimeseries[1]>globalTimeseriesMax){
            globalTimeseriesMax = minMaxTimeseries[1];
            aMax = minMaxTimeseries[1]+1; // Leave some spaces on the bottom
        }else{
            aMax = globalTimeseriesMax+1; // Leave some spaces on the bottom
        }

        this.aVariables.bottomChart.getAxisY().setRange(new Range(aMin, aMax*powRatio));
//        System.out.println("minMax: " + minBound + ", " + maxBound);
//        System.out.println("val: " + val);
    }

    public void setSlideZoomDefaultValue(){
        int minBound = this.aGUIComponents.zoomSliderCenterChart.getMinimum();

        this.aGUIComponents.zoomSliderCenterChart.setValue(minBound);
        this.aGUIComponents.zoomSliderBottomChart.setValue(minBound);
        timeSeriesSlideZoomCenterChart(minBound);
        timeSeriesSlideZoomBottomChart(minBound);
    }

    public void shapeletToprightChartUpdateScale() {
        if(firstCallShapelet){
            firstCallShapelet = false;
            this.aVariables.topRightShapeletChart.getAxisY().setRangePolicy( new RangePolicyFixedViewport());
        }

        double[] minMaxShapelet = this.aVariables.minMaxShapeletDataset;
        double aMin;
        double aMax;

        aMin = minMaxShapelet[0]; // Leave some spaces on the bottom

        aMax = minMaxShapelet[1]; // Leave some spaces on the bottom

//        System.out.println("aMin:" + minMaxShapelet[0]);

        this.aVariables.topRightShapeletChart.getAxisY().setRange(new Range(aMin, aMax));
    }

    /*---------------------------------------------------------------

     **                    timeSeriesZoomIn()                       **

     ---------------------------------------------------------------*/
    public void timeSeriesZoomIn(){

        double max = 2.5;
        double currentVal = ((Double)this.aGUIComponents.spinner.getValue()).floatValue();
        System.out.println("currentVal of zoom rate from timeSeriesZoomIn(): " + currentVal);

        if(currentVal < max - 0.1) { //Only if currentVal < max, it can work [2.5 = 2.499999, it should minus 0.1]
            this.aGUIComponents.spinner.setValue(Double.valueOf(currentVal+0.1));
//            setScale(currentVal);
        }

    }

    /*---------------------------------------------------------------

     **                    timeSeriesZoomOut()                       **

     ---------------------------------------------------------------*/
    public void timeSeriesZoomOut(){

        double min = 0.5;
        double currentVal = ((Double)this.aGUIComponents.spinner.getValue()).floatValue();
        System.out.println("currentVal of zoom rate from timeSeriesZoomOut(): " + currentVal);

        if(currentVal > min) {  //Only if currentVal > min, it can work
            this.aGUIComponents.spinner.setValue(Double.valueOf(currentVal-0.1));
//            setScale(currentVal);
        }

    }

    /*---------------------------------------------------------------

     **                    timeSeriesMoveLeft()                       **

     ---------------------------------------------------------------*/
    public void timeSeriesMoveLeft(){
        double xL = this.aVariables.centerChartXL;
        double xR = this.aVariables.centerChartXR;

        if(xR<(this.aVariables.dataset_withCurrentLabel.numFeatures+1)*1.1) {
            this.aVariables.centerChart.getAxisX().setRange(new Range(xL += 1, xR += 1));
        }

        this.aVariables.centerChartXL = xL;
        this.aVariables.centerChartXR = xR;
    }

    /*---------------------------------------------------------------

     **                    timeSeriesMoveRight()                      **

     ---------------------------------------------------------------*/
    public void timeSeriesMoveRight(){
        double xL = this.aVariables.centerChartXL;
        double xR = this.aVariables.centerChartXR;

        if(xL>-10) {
            this.aVariables.centerChart.getAxisX().setRange(new Range(xL -= 1, xR -= 1));
        }

        this.aVariables.centerChartXL = xL;
        this.aVariables.centerChartXR = xR;
    }

    /*---------------------------------------------------------------

     **                    setScaleAndPosition()                       **

     ---------------------------------------------------------------*/
    public void setScaleAndPosition(){
        this.aVariables.oldScale = 1.0;
        this.aVariables.centerChartXL = -1;
        this.aVariables.centerChartXR = this.aVariables.dataset_withCurrentLabel.numFeatures+1;
    }

    public void spinnerSetScale(){
        this.aGUIComponents.spinner.setValue(this.aVariables.oldScale);
    }

    public void centerChartSetRange(){
        this.aVariables.centerChart.getAxisX().setRange(new Range(this.aVariables.centerChartXL, this.aVariables.centerChartXR));
    }

    public void bottomChartSetRange(){
        this.aVariables.bottomChart.getAxisX().setRange(new Range(this.aVariables.centerChartXL, this.aVariables.centerChartXR));
    }

    public void resetGlobalTimeseriesMinMax(){
        globalTimeseriesMin = Double.POSITIVE_INFINITY;
        globalTimeseriesMax = Double.NEGATIVE_INFINITY;
    }

    /*** ---------------------------------------------------------------------------------------------------------* */
}
