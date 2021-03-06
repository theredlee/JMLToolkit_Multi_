package GUI.GUI_BoxLook_New_25072020.MethodLibrary.OldestVersion.GUIComponents_;

import javax.swing.*;
import java.awt.*;

public abstract class GUIComponents_abstract {
    /*** initializeMeasurements --**/
    public int deskTopX, deskTopY, frameX, frameY, frameHeight, frameWidth, frameCentroidX, frameCentroidY;
    public int labelWidth, labelHeight, buttonWidth, buttonHeight, comboBoxWidth, comboBoxHeight;
    /*** initializeJFrame --**/
    public JFrame frmTimeSeries;
    /*** initializeLayers--**/
    public JLayeredPane frmTimeSeriesLayerFirst, frmTimeSeriesLayerSecond;
    /*** initializeFont --**/
    public Font myFont, font;
    /*** initializeJLabels --**/
    public JLabel lblZoomScale, lblHorizontallyMove, lblShapeletsNumSelector, lblMissingRatio, lblGapSizeRatio, lblImputation, eigenSeriesInterpolation, lblLabelList, lblTimeseries, lblShapelet;
    /*** initializeJSpinner --**/
    public JSpinner spinner;
    /*** initializeJButton --**/
    public JButton btnZoomIn, btnZoomOut, btnMoveLeft, btnMoveRight, btnSetTsIdRange, btnSetShptIdRange, btnSortedByLenShptIdASC, btnSortedByLenShptIdDESC, btnClearAllTraces, btnLoadDataset, btnLoadShapelet, btnSelectTop_K_Shapelets, btnRunBspcover, btnInvokeDT;
    /*** initializeJTextField --**/
    public JTextField iterationTextField, alphabetSizeTextField, timeSeriesRangeMinTextField, timeSeriesRangeMaxTextField, shapeletsRangeMinTextField, shapeletsRangeMaxTextField,
            chartI_TS_TextField, chartI_Interpolated_TextField, chartI_Shapelet_TextField, chartII_Shapelet_TextField, chartII_ShapeletLabel_TextField,
            top_K_shapeletsTextField, labelShapeletTextField, datasetTextField, noPointsTextField, numOfShapeletsTextField, distanceSTTextField, distanceSTTextField_II, pcoverTextField, labelTextField;
    /*** initializeJTextArea --**/
    public JTextArea bspcoverInfoTextArea, textAreaInOnChart_I;
    /*** initializeJCheckBox --**/
    public JCheckBox enableSupervisionCheckBox, imputeCheckBox, shuffleDataSetCheckBox, enableDTWingCheckBox, imputationTechnique, classListItem;
    /*** initializeJList --**/
    public JList labelList, TS_labelList_Horizontal, timeSeriesList, shapeletJList, shapeletLabelJList;
    /*** initializeJScrollPane --**/
    public JScrollPane TS_labelScrollPane, labelScrollPane, timeSeriesScrollPane, shapeLetScrollPane, labelLabelListScrollPane, bspcoverInfoScrollPane;
    /*** initializeJPanel --**/
    public JPanel centerChartPanel, topRightPanel, bottomChartPanel;
    /*** initializeLayeredPane --**/
    public JLayeredPane layeredPane_CenterChart, layeredPane_TopRightChart, layeredPane_BottomChart;
    /*** -------------------------------------------------------**/
}
