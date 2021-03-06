package GUI.GUI_BoxLook_New_25072020.MethodLibrary.OldestVersion.GUIComponents_;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GUIComponents_ extends GUIComponents_abstract {

    /**
     * Create the application.
     */

    /*** GUIComponents ---------------------------------------------------------------------------------------------------------------------------**/
    public GUIComponents_(){
        initialize();
    }

    /*** initialize --------------------------------------------**/
    private void initialize() {

        initializeMeasurements();
        initializeJFrame();
        initializeLayers();
        //Coordinate auxiliary
        //initializeCoordinate();
        initializeFont();
        initializeJLabels();
        initializeJSpinner();
        initializeJButton();
        initializeJTextField();
        initializeJTextArea();
        initializeJCheckBox();
        initializeJList();
        initializeJScrollPane();
        initializeJPanel();
        initializeLayeredPaneForChart();

    }

    /**
     * Initialize the contents of the frame.
     */

    /*** initializeMeasurements --------------------------------------------**/
    private void initializeMeasurements() {
        /***  -------------------------------- **/
        deskTopX = 200;
        deskTopY = 30;
        frameX = 0;
        frameY = 0;
        frameWidth = 1150;
        frameHeight = 800;
        frameCentroidX = (frameX + frameWidth)/2;
        frameCentroidY = (frameY + frameHeight)/2;

        /***  -------------------------------- **/
        labelWidth = 130;
        labelHeight = 15;
        buttonWidth = 130;
        buttonHeight = 25;
        comboBoxWidth = 130;
        comboBoxHeight = 25;
    }


    /*** initializeJFrame --------------------------------------------**/
    private void initializeJFrame() {
        /***  -------------------------------- **/
        frmTimeSeries = new JFrame();
        frmTimeSeries.setTitle("Visualet");
        frmTimeSeries.setBounds(deskTopX, deskTopY, frameWidth, frameHeight);
        frmTimeSeries.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmTimeSeries.getContentPane().setLayout(null);
    }


    /*** initializeLayers--------------------------------------------**/
    public void initializeLayers() {

//        /***  -------------------------------- * */
//        // JCombobox only
//        frmTimeSeriesLayerSecond = new JLayeredPane();
//        frmTimeSeriesLayerSecond.setBounds(frameX, frameY, frmTimeSeries.getBounds().width, frmTimeSeries.getBounds().height);
//        frmTimeSeries.getContentPane().add(frmTimeSeriesLayerSecond);

        /***  -------------------------------- **/
        frmTimeSeriesLayerFirst = new JLayeredPane();
        frmTimeSeriesLayerFirst.setBounds(frameX, frameY, frmTimeSeries.getBounds().width, frmTimeSeries.getBounds().height);
        frmTimeSeries.getContentPane().add(frmTimeSeriesLayerFirst, Integer.valueOf(0));

    }


    /*** initializePaint --------------------------------------------**/
    private void initializeCoordinate(){
//        GridPane myGridPane = new GridPane();
//        myGridPane.setBounds(frameX, frameY, frmTimeSeriesLayerSecond.getWidth(), frmTimeSeriesLayerSecond.getHeight());
//        frmTimeSeriesLayerSecond.add(myGridPane);
    }


    /*** initializeFont --------------------------------------------**/
    private void initializeFont(){
        /***  -------------------------------- **/
        myFont = new Font("SansSerif", Font.PLAIN, 15);

        /***  -------------------------------- **/
        font = new Font("SansSerif", Font.PLAIN, 12);
    }


    /*** initializeJLabels --------------------------------------------**/
    private void initializeJLabels(){
        /***  -------------------------------- **/
        lblZoomScale = new JLabel("Zoom Scale:");
        lblZoomScale.setFont(myFont);
        lblZoomScale.setBounds(596, 440, 100, 25);    /***209, 16, 101, 15 ***/
        frmTimeSeriesLayerFirst.add(lblZoomScale);


        /***  -------------------------------- **/
        lblHorizontallyMove = new JLabel("Horizontal Shift / Zoom:");
        lblHorizontallyMove.setFont(myFont);
        lblHorizontallyMove.setBounds(762, 440, 200, 25);    /***209, 16, 101, 15 ***/
        frmTimeSeriesLayerFirst.add(lblHorizontallyMove);


        /***  -------------------------------- **/
        lblShapeletsNumSelector = new JLabel("Top k shapelets:");
        lblShapeletsNumSelector.setFont(myFont);
        lblShapeletsNumSelector.setBounds(295, 12, 130, 15);    /***209, 16, 101, 15 ***/
        frmTimeSeriesLayerFirst.add(lblShapeletsNumSelector);


        /***  -------------------------------- **/
        lblMissingRatio = new JLabel("Iteration");
        lblMissingRatio.setFont(myFont);
        lblMissingRatio.setBounds(171, 40, 101, 15);    /***209, 16, 101, 15 ***/
        frmTimeSeriesLayerFirst.add(lblMissingRatio);


        /***  -------------------------------- **/
        lblGapSizeRatio = new JLabel("Alphabet Size");
        lblGapSizeRatio.setFont(myFont);
        lblGapSizeRatio.setBounds(171, 70, 122, 15); /***209, 47, 122, 15 ***/
        frmTimeSeriesLayerFirst.add(lblGapSizeRatio);

        //        /***  -------------------------------- **/
        //        lblImputation = new JLabel("Imputation:");
        //        lblImputation.setFont(myFont);
        //        lblImputation.setBounds(171, 70, 122, 15);   /***Imputation: 459, 16, 122, 15 ***/
        //        frmTimeSeriesLayerFirst.add(lblImputation);
        //
        //        String[] imputationTechniques = {
        //                "linear",
        //                "cubicspline",
        //                "bspline",
        //                "collaborative",
        //                "em",
        //                "mbi"};
        //
        //        imputationTechnique = new JComboBox(imputationTechniques);
        //        //imputationTechnique.setBounds();
        //        imputationTechnique.setBounds(284, 70, 142, 25); /***Interpolation JComboBox559, 16, 142, 25 ***/
        //        frmTimeSeriesLayerFirst.add(imputationTechnique);


        /***  -------------------------------- **/
        eigenSeriesInterpolation = new JLabel("pCover");
        eigenSeriesInterpolation.setFont(myFont);
        eigenSeriesInterpolation.setBounds(171, 100, 122, 15);
        frmTimeSeriesLayerFirst.add(eigenSeriesInterpolation);


        /***  -------------------------------- **/
        lblLabelList = new JLabel("Class label:");
        lblLabelList.setFont(myFont);
        lblLabelList.setBounds(frameX + 10, frameY + 45, labelWidth, labelHeight); /***  459, 16, 122, 15, --- TImeseriesLable: 12, 45, 83, 15 ***/
        frmTimeSeriesLayerFirst.add(lblLabelList);


        /***  -------------------------------- **/
        lblTimeseries = new JLabel("Time series:");
        lblTimeseries.setFont(myFont);
        lblTimeseries.setBounds(12, 151, 89, 15);
        frmTimeSeriesLayerFirst.add(lblTimeseries);


        /***  -------------------------------- **/
        lblShapelet = new JLabel("Shapelets:");
        lblShapelet.setFont(myFont);
        lblShapelet.setBounds(12,508,83,15); /*** 12,508,83,15 ***/
        frmTimeSeriesLayerFirst.add(lblShapelet);

    }


    /*** initializeJSpinner --------------------------------------------**/
    public JSpinner spinner;
    private void initializeJSpinner(){
        /***  -------------------------------- **/
        spinner = new JSpinner(new SpinnerNumberModel(1.0, 0.5, 2.5, .1));
        spinner.setBounds(682, 440, 50, 25);
        spinner.setPreferredSize(new Dimension(45, spinner.getPreferredSize().height));
        frmTimeSeriesLayerFirst.add(spinner);
    }


    /*** initializeJButton --------------------------------------------**/
    private void initializeJButton(){
        /***  -------------------------------- **/
        btnZoomIn = new JButton("Zoom In");
        btnZoomIn.setFont(myFont);
        btnZoomIn.setBounds(frameCentroidX + 400,  frameCentroidY + 25, buttonWidth/2 + 12, buttonHeight - 10);    /** 460, 485, 50, 20 **/
        btnZoomIn.setBackground(Color.WHITE);
        frmTimeSeriesLayerFirst.add(btnZoomIn);


        /***  -------------------------------- **/
        btnZoomOut = new JButton("Zoom Out");
        btnZoomOut.setFont(myFont);
        btnZoomOut.setBounds(frameCentroidX + 400, frameCentroidY + 65, buttonWidth/2 + 12, buttonHeight - 10);    /** 460, 485, 50, 20 **/
        btnZoomOut.setBackground(Color.WHITE);
        frmTimeSeriesLayerFirst.add(btnZoomOut);


        /***  -------------------------------- **/
        btnMoveLeft = new JButton("Left");
        btnMoveLeft.setFont(myFont);
        btnMoveLeft.setBounds((frameCentroidX + 400 - 20),  frameCentroidY + 45, buttonWidth/2 - 10, buttonHeight - 10);    /** 460, 485, 50, 25 **/
        btnMoveLeft.setBackground(Color.WHITE);
        frmTimeSeriesLayerFirst.add(btnMoveLeft);


        /***  -------------------------------- **/
        btnMoveRight = new JButton("Right");
        btnMoveRight.setFont(myFont);
        btnMoveRight.setBounds(frameCentroidX + 445, frameCentroidY + 45, buttonWidth/2 - 10, buttonHeight - 10);    /** 500, 485, 50, 25 **/
        btnMoveRight.setBackground(Color.WHITE);
        frmTimeSeriesLayerFirst.add(btnMoveRight);


        /***  -------------------------------- **/
        btnSetTsIdRange = new JButton("Enable");
        btnSetTsIdRange.setFont(myFont);
        btnSetTsIdRange.setBounds(12, 388, buttonWidth, buttonHeight);    /** 110, 172, 40, 25 **/
        frmTimeSeriesLayerFirst.add(btnSetTsIdRange);


        /***  -------------------------------- **/
        btnSetShptIdRange = new JButton("Enable");
        btnSetShptIdRange.setFont(myFont);
        btnSetShptIdRange.setBounds(12, 716, buttonWidth, buttonHeight);    /** 12, 716, 130, 25 **/
        frmTimeSeriesLayerFirst.add(btnSetShptIdRange);


        /***  -------------------------------- **/
        /*** Length ASC sorting for Shapelets ***/
        btnSortedByLenShptIdASC = new JButton("ASC");
        btnSortedByLenShptIdASC.setFont(myFont);
        btnSortedByLenShptIdASC.setBounds(12, 745, buttonWidth/2, buttonHeight);    /** 12, 745, 60, 25 **/
        frmTimeSeriesLayerFirst.add(btnSortedByLenShptIdASC);


        /***  -------------------------------- **/
        /*** Length DESC sorting for Shapelets ***/
        btnSortedByLenShptIdDESC = new JButton("DESC");
        btnSortedByLenShptIdDESC.setFont(myFont);
        btnSortedByLenShptIdDESC.setBounds(76, 745, buttonWidth/2, buttonHeight);    /** 12, 716, 130, 25 **/
        frmTimeSeriesLayerFirst.add(btnSortedByLenShptIdDESC);



        /***  -------------------------------- **/
        btnClearAllTraces = new JButton("Clear All");
        btnClearAllTraces.setFont(myFont);
        btnClearAllTraces.setBounds(12, 420, buttonWidth, buttonHeight); /*** timeSeriesList new Bounds: 12, 112, 130, 303 -> y = 112 + 303 ***/
        frmTimeSeriesLayerFirst.add(btnClearAllTraces);


        /***  -------------------------------- **/
        btnLoadDataset = new JButton("Load Dataset");
        btnLoadDataset.setFont(myFont);
        btnLoadDataset.setBounds(frameX + 10, frameY + 10, buttonWidth, buttonHeight);    /*** 12,508,83,15 ***/
        frmTimeSeriesLayerFirst.add(btnLoadDataset);



        /***  -------------------------------- **/
        btnLoadShapelet = new JButton("Load Shapelet");
        btnLoadShapelet.setFont(myFont);
        btnLoadShapelet.setBounds(12, 475, buttonWidth, buttonHeight);     /*** 12,508,83,15 ***/
        frmTimeSeriesLayerFirst.add(btnLoadShapelet);



        /***  -------------------------------- **/
        btnSelectTop_K_Shapelets = new JButton("Top k shapelets");
        btnSelectTop_K_Shapelets.setFont(myFont);
        btnSelectTop_K_Shapelets.setBounds(470, 10, buttonWidth + 15, buttonHeight);  /*** 12,508,83,15 ***/
        frmTimeSeriesLayerFirst.add(btnSelectTop_K_Shapelets);



        /***  -------------------------------- **/
        btnRunBspcover = new JButton("BSPCOVER");
        btnRunBspcover.setFont(myFont);
        btnRunBspcover.setBounds(165, 10, buttonWidth, buttonHeight);
        frmTimeSeriesLayerFirst.add(btnRunBspcover);



        /***  -------------------------------- **/
        btnInvokeDT = new JButton("Enable DTW");
        btnInvokeDT.setFont(myFont);
        btnInvokeDT.setBounds(frameX + 170, frameCentroidY + 40, buttonWidth, buttonHeight);     /*** 12,508,83,15 ***/
        frmTimeSeriesLayerFirst.add(btnInvokeDT);
    }


    /*** initializeJTextField --------------------------------------------**/
    private void initializeJTextField(){
        /***  -------------------------------- **/
        top_K_shapeletsTextField = new JTextField();
        top_K_shapeletsTextField.setText("5");
        top_K_shapeletsTextField.setBounds(420, 12, 30, 19); /***328, 12, 114, 19**/
        frmTimeSeriesLayerFirst.add(top_K_shapeletsTextField);
        top_K_shapeletsTextField.setColumns(10);


        /***  -------------------------------- **/
        iterationTextField = new JTextField();
        iterationTextField.setText("1000");
        iterationTextField.setBounds(303, 40, 114, 19); /***328, 12, 114, 19**/
        frmTimeSeriesLayerFirst.add(iterationTextField);
        iterationTextField.setColumns(10);


        /***  -------------------------------- **/
        alphabetSizeTextField = new JTextField();
        alphabetSizeTextField.setText("4");
        alphabetSizeTextField.setColumns(10);
        alphabetSizeTextField.setBounds(303, 70, 114, 19);  /***328, 43, 114, 19 ***/
        frmTimeSeriesLayerFirst.add(alphabetSizeTextField);


        /***  -------------------------------- **/
        pcoverTextField = new JTextField();
        pcoverTextField.setText("1");
        pcoverTextField.setColumns(10);
        pcoverTextField.setBounds(303, 100, 114, 25);
        frmTimeSeriesLayerFirst.add(pcoverTextField);


        /***  -------------------------------- **/
        timeSeriesRangeMinTextField = new JTextField();
        timeSeriesRangeMinTextField.setText("0");
        timeSeriesRangeMinTextField.setBounds(17, 365, 55, 19); /** 12, 172, 44, 19 **/
        frmTimeSeriesLayerFirst.add(timeSeriesRangeMinTextField);
        timeSeriesRangeMinTextField.setColumns(5);


        /***  -------------------------------- **/
        timeSeriesRangeMaxTextField = new JTextField();
        timeSeriesRangeMaxTextField.setText("10000"); /*** This initialized value affected the size of the timeserieslist **/
        timeSeriesRangeMaxTextField.setBounds(77, 365, 55, 19); /*** 65, 172, 44, 19 **/
        frmTimeSeriesLayerFirst.add(timeSeriesRangeMaxTextField);
        timeSeriesRangeMaxTextField.setColumns(5);


        /***  -------------------------------- **/
        shapeletsRangeMinTextField = new JTextField();
        shapeletsRangeMinTextField.setText("0");
        shapeletsRangeMinTextField.setBounds(17, 693, 55, 19); /** 12, 172, 44, 19 **/
        frmTimeSeriesLayerFirst.add(shapeletsRangeMinTextField);
        shapeletsRangeMinTextField.setColumns(5);


        /***  -------------------------------- **/
        shapeletsRangeMaxTextField = new JTextField();
        shapeletsRangeMaxTextField.setText("20");
        shapeletsRangeMaxTextField.setBounds(77, 693, 55, 19); /*** 65, 172, 44, 19 **/
        frmTimeSeriesLayerFirst.add(shapeletsRangeMaxTextField);
        shapeletsRangeMaxTextField.setColumns(5);


        /***  -------------------------------- **/
        datasetTextField = new JTextField();
        datasetTextField.setEditable(false);
        datasetTextField.setBounds(171, 125, 367, 19); /*** original_y = 86 ***/
        frmTimeSeriesLayerFirst.add(datasetTextField);
        datasetTextField.setColumns(10);


        /***  -------------------------------- **/
        noPointsTextField = new JTextField();
        noPointsTextField.setEditable(false);
        noPointsTextField.setBounds(171, 150, 163, 19); /*** 196, 391, 114, 19 -> x + width = 196 + 175 = 371***/
        frmTimeSeriesLayerFirst.add(noPointsTextField);
        noPointsTextField.setColumns(10);


        /***  -------------------------------- **/
        labelTextField = new JTextField();
        labelTextField.setEditable(false);
        labelTextField.setBounds(330, 150, 110, 19); /*** 315, 391, 114, 19 -> x + width = 380 + 175 = 555***/
        frmTimeSeriesLayerFirst.add(labelTextField);
        labelTextField.setColumns(10);


        /***  -------------------------------- **/
        numOfShapeletsTextField = new JTextField();
        numOfShapeletsTextField.setEditable(false);
        numOfShapeletsTextField.setBounds(449, 150, 160, 19); /*** 196, 417, 114, 19 -> x + width = 564 + 175 = 739***/
        frmTimeSeriesLayerFirst.add(numOfShapeletsTextField);
        numOfShapeletsTextField.setColumns(10);


        /***  -------------------------------- **/
        distanceSTTextField = new JTextField();
        distanceSTTextField.setEditable(false);
        distanceSTTextField.setBounds(608, 150, 150, 19); /*** 315, 417, 114, 19 -> x + width = 748 + 175 = 923***/
        frmTimeSeriesLayerFirst.add(distanceSTTextField);


        /***  -------------------------------- **/
        labelShapeletTextField = new JTextField();
        labelShapeletTextField.setEditable(false);
        labelShapeletTextField.setBounds(767, 150, 150, 19); /*** 315, 443, 114, 19 -> x + width = 932 + 175 = 1107***/
        frmTimeSeriesLayerFirst.add(labelShapeletTextField);
        labelShapeletTextField.setColumns(10);


        /***  -------------------------------- **/
        distanceSTTextField_II = new JTextField();
        distanceSTTextField_II.setEditable(false);
        distanceSTTextField_II.setBounds(926, 150, 150, 19); /*** 315, 443, 114, 19 -> x + width = 932 + 175 = 1107***/
        frmTimeSeriesLayerFirst.add(distanceSTTextField_II);


        /***  -------------------------------- **/
        noPointsTextField.setVisible(false);
        numOfShapeletsTextField.setVisible(false);
        labelShapeletTextField.setVisible(false);
        distanceSTTextField.setVisible(false);
        distanceSTTextField_II.setVisible(false);
        datasetTextField.setVisible(false);
        labelTextField.setVisible(false);


        /***  -------------------------------- **/
        chartI_TS_TextField = new JTextField();
        chartI_TS_TextField.setText("Class Label No.:");
        chartI_TS_TextField.setEditable(false);
        chartI_TS_TextField.setBounds(785,5,125, 15);
        chartI_TS_TextField.setBorder(null);
        chartI_TS_TextField.setFont(font);
        chartI_TS_TextField.setForeground(Color.MAGENTA);


        /***  -------------------------------- **/
        chartI_Interpolated_TextField = new JTextField();
        chartI_Interpolated_TextField.setText("Time Series No.:");
        chartI_Interpolated_TextField.setEditable(false);
        chartI_Interpolated_TextField.setBounds(785,20,125, 15);
        chartI_Interpolated_TextField.setBorder(null);
        chartI_Interpolated_TextField.setFont(font);
        chartI_Interpolated_TextField.setForeground(Color.BLUE);


        /***  -------------------------------- **/
        chartI_Shapelet_TextField = new JTextField();
        chartI_Shapelet_TextField.setText("Shapelet No.:");
        chartI_Shapelet_TextField.setEditable(false);
        chartI_Shapelet_TextField.setBounds(785,35,125, 15);
        chartI_Shapelet_TextField.setBorder(null);
        chartI_Shapelet_TextField.setFont(font);
        chartI_Shapelet_TextField.setForeground(Color.GREEN);


        /***  -------------------------------- **/
        chartII_Shapelet_TextField = new JTextField();
        chartII_Shapelet_TextField.setText("Shapelet No.:");
        chartII_Shapelet_TextField.setEditable(false);
        chartII_Shapelet_TextField.setBounds(295,5,125, 15);
        chartII_Shapelet_TextField.setBorder(null);
        chartII_Shapelet_TextField.setFont(font);
        chartII_Shapelet_TextField.setForeground(Color.GREEN);


        /***  -------------------------------- **/
        chartII_ShapeletLabel_TextField = new JTextField();
        chartII_ShapeletLabel_TextField.setText("Shapelet Label.:");
        chartII_ShapeletLabel_TextField.setEditable(false);
        chartII_ShapeletLabel_TextField.setBounds(295,20,125, 15);
        chartII_ShapeletLabel_TextField.setBorder(null);
        chartII_ShapeletLabel_TextField.setFont(font);
        chartII_ShapeletLabel_TextField.setForeground(Color.GREEN);
    }


    /*** initializeJTextArea --------------------------------------------**/
    private void initializeJTextArea(){
        /***  -------------------------------- **/
        bspcoverInfoTextArea = new JTextArea();
        bspcoverInfoTextArea.setText("BSPCOVER Console: ");
        bspcoverInfoTextArea.setEditable(false);
        bspcoverInfoTextArea.setBounds(171,675,905,100);
    }


    /*** initializeJCheckBox --------------------------------------------**/
    private void initializeJCheckBox(){
        /***  -------------------------------- **/
        imputeCheckBox = new JCheckBox("Impute", false);
        imputeCheckBox.setFont(myFont);
        imputeCheckBox.setBounds(464, 40, 100, 15); /***720, 16, 110, 15***/ /*******??????******/
        frmTimeSeriesLayerFirst.add(imputeCheckBox);


        /***  -------------------------------- **/
        shuffleDataSetCheckBox = new JCheckBox("Shuffle", false);
        shuffleDataSetCheckBox.setFont(myFont);
        shuffleDataSetCheckBox.setBounds(464, 70, 110, 15); /***720, 47, 110, 15***/
        frmTimeSeriesLayerFirst.add(shuffleDataSetCheckBox);


        /***  -------------------------------- **/
        enableSupervisionCheckBox = new JCheckBox("ED", false);
        enableSupervisionCheckBox.setFont(myFont);
        enableSupervisionCheckBox.setBounds(464, 100, 110, 15);  /***820, 16, 110, 15***/
        frmTimeSeriesLayerFirst.add(enableSupervisionCheckBox);


        //        /***  -------------------------------- **/
        //        enableDTWingCheckBox = new JCheckBox("DWT", false);
        //        enableDTWingCheckBox.setFont(myFont);
        //        enableDTWingCheckBox.setBounds(464, 100, 110, 15);  /***820, 47, 110, 15***/
        //        frmTimeSeriesLayerFirst.add(enableDTWingCheckBox);
    }


    /*** initializeJList --------------------------------------------**/
    private void initializeJList(){
        /***  -------------------------------- **/
        TS_labelList_Horizontal = new JList();
        TS_labelList_Horizontal.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        TS_labelList_Horizontal.setFont(myFont);
        TS_labelList_Horizontal.setBounds(12, 71, 60, 90); /*** labelList original Bounds: x=12, y=62, width=130, height=403 ***/
        TS_labelList_Horizontal.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        TS_labelList_Horizontal.setModel(new AbstractListModel() {
            String[] values = new String[] {};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });

        /***  -------------------------------- **/
        labelList = new JList();
        labelList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        labelList.setFont(myFont);
        labelList.setBounds(12, 71, 130, 70); /*** labelList original Bounds: x=12, y=62, width=130, height=403 ***/
        labelList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        labelList.setModel(new AbstractListModel() {
            String[] values = new String[] {};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });


        /***  -------------------------------- **/
        timeSeriesList = new JList();
        timeSeriesList.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        timeSeriesList.setFont(myFont);
//        timeSeriesList.setBounds(12, 172, 130, 183);
        timeSeriesList.setBounds((60+12+5), 71, 65, 183); /*** timeSeriesList original Bounds: x=12, y=62, width=130, height=403 ***/
        timeSeriesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        timeSeriesList.setModel(new AbstractListModel() {
            String[] values = new String[] {};
            public int getSize() {
                return values.length;
            }
            public Object getElementAt(int index) {
                return values[index];
            }
        });


        /***  -------------------------------- **/
        shapeletLabelJList = new JList();
        shapeletLabelJList.setBorder((new EtchedBorder(EtchedBorder.LOWERED, null, null)));
        shapeletLabelJList.setFont(myFont);
        shapeletLabelJList.setBounds(12,525, 60, 80); /*** 12,533,130, 150 ***/
        shapeletLabelJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        shapeletLabelJList.setModel(new AbstractListModel() {
            String[] numbers = new String[] {};
            public int getSize() { return numbers.length; }
            public Object getElementAt(int index) { return numbers[index]; }
        });


        /***  -------------------------------- **/
        shapeletJList = new JList();
        shapeletJList.setBorder((new EtchedBorder(EtchedBorder.LOWERED, null, null)));
        shapeletJList.setFont(myFont);
        shapeletJList.setBounds((60+12+5),525,65, 130); /*** 12,533,130, 150 ***/
        shapeletJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        shapeletJList.setModel(new AbstractListModel() {
            String[] numbers = new String[] {};
            public int getSize() { return numbers.length; }
            public Object getElementAt(int index) { return numbers[index]; }
        });

    }


    /*** initializeJScrollPane --------------------------------------------**/
    private void initializeJScrollPane(){
        /***  -------------------------------- **/
        TS_labelScrollPane = new JScrollPane(TS_labelList_Horizontal);
        TS_labelScrollPane.setBounds( TS_labelList_Horizontal.getBounds() );
        frmTimeSeriesLayerFirst.add(TS_labelScrollPane);


        /***  -------------------------------- **/
//        labelScrollPane = new JScrollPane(labelList);
//        labelScrollPane.setBounds( labelList.getBounds() );
//        frmTimeSeriesLayerFirst.add(labelScrollPane);


        /***  -------------------------------- **/
        timeSeriesScrollPane = new JScrollPane(timeSeriesList);
        timeSeriesScrollPane.setBounds( timeSeriesList.getBounds() );
        frmTimeSeriesLayerFirst.add(timeSeriesScrollPane);


        /***  -------------------------------- **/
        shapeLetScrollPane = new JScrollPane(shapeletJList);
        shapeLetScrollPane.setBounds(shapeletJList.getBounds());
        frmTimeSeriesLayerFirst.add(shapeLetScrollPane);

        /***  -------------------------------- **/
        labelLabelListScrollPane = new JScrollPane(shapeletLabelJList);
        labelLabelListScrollPane.setBounds(shapeletLabelJList.getBounds());
        frmTimeSeriesLayerFirst.add(labelLabelListScrollPane);


        /***  -------------------------------- **/
        bspcoverInfoScrollPane = new JScrollPane(bspcoverInfoTextArea);
        bspcoverInfoScrollPane.setBounds(bspcoverInfoTextArea.getBounds());
        frmTimeSeriesLayerFirst.add(bspcoverInfoScrollPane);
    }


    /*** initializeJPanel --------------------------------------------**/
    private void initializeJPanel(){
        /***  -------------------------------- **/
        centerChartPanel = new JPanel();
        centerChartPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null),
                "Time series & shapelets", TitledBorder.LEADING, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 15), null));

        centerChartPanel.setBounds(0, 0, 905, 250); /*** 171, 119, 905, 211 ***/


        /***  -------------------------------- **/
        topRightPanel = new JPanel();
        topRightPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED,
                null, null, null, null),
                "Shapelets only", TitledBorder.LEADING, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 15), null));

        topRightPanel.setBounds(0, 0, 420, 131); /***Interpolation JComboBox: 0, 0, 142, 25 -> in a panel layer***/


        /***  -------------------------------- * */
        bottomChartPanel = new JPanel();
        bottomChartPanel.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED,
                null, null, null, null),
                "Timeseries only", TitledBorder.LEADING, TitledBorder.TOP, new Font("SansSerif", Font.PLAIN, 15), null));

        bottomChartPanel.setBounds(0, 0, 905, 188); /*** 171, 380, 905, 171 ***/
    }


    /*** initializeLayeredPane --------------------------------------------**/
    private void initializeLayeredPaneForChart(){
        /***  -------------------------------- **/
        layeredPane_CenterChart = new JLayeredPane();
        layeredPane_CenterChart.setBounds(171, 170, 905, 250); /***Interpolation JComboBox: 559, 16, 142, 25 ***/
        layeredPane_CenterChart.setBorder(BorderFactory.createTitledBorder(
                ""));
        frmTimeSeriesLayerFirst.add(layeredPane_CenterChart);
        layeredPane_CenterChart.add(centerChartPanel, Integer.valueOf(0));
        layeredPane_CenterChart.add(chartI_TS_TextField, Integer.valueOf(1));
        layeredPane_CenterChart.add(chartI_Interpolated_TextField, Integer.valueOf(1));
        layeredPane_CenterChart.add(chartI_Shapelet_TextField, Integer.valueOf(1));


        /***  -------------------------------- **/
        layeredPane_TopRightChart = new JLayeredPane();
        layeredPane_TopRightChart.setBounds(656, 7, 420, 131); /***Interpolation JComboBox: 559, 16, 142, 25 ***/
        layeredPane_TopRightChart.setBorder(BorderFactory.createTitledBorder(
                ""));
        frmTimeSeriesLayerFirst.add(layeredPane_TopRightChart);
        layeredPane_TopRightChart.add(topRightPanel, Integer.valueOf(0));
        layeredPane_TopRightChart.add(chartII_Shapelet_TextField, Integer.valueOf(1));


        /***  -------------------------------- **/
        layeredPane_BottomChart = new JLayeredPane();
        layeredPane_BottomChart.setBounds(171, 480, 905, 188);
        layeredPane_BottomChart.setBorder(BorderFactory.createTitledBorder(
                ""));
        frmTimeSeriesLayerFirst.add(layeredPane_BottomChart);
        layeredPane_BottomChart.add(bottomChartPanel, Integer.valueOf(0));
    }

    /*** main --------------------------------------------**/
    public static void main( String [] args )
    {
        GUIComponents_ winGUIComponents = new GUIComponents_();
        winGUIComponents.frmTimeSeries.setVisible(true);

    }

}