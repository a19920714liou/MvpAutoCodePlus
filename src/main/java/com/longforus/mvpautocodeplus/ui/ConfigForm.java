package com.longforus.mvpautocodeplus.ui;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Created by XQ Yang on 2018/6/25  14:19.
 * Description :
 */

public class ConfigForm {

    public JPanel mPanel;
    public JTextField tv_v_name;
    public JTextField tv_p_name;
    public JTextField tv_m_name;
    public JTextField tv_model_impl;
    public JTextField tv_presenter_impl;
    public JTextField tv_view_activity;
    public JTextField tv_view_fragment;
    public JButton btn_view_select;
    public JButton btn_view_a_select;
    public JButton btn_view_f_select;
    public JButton btn_p_select;
    public JButton btn_pi_select;
    public JButton btn_m_select;
    public JButton btn_mi_select;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    {
        // GUI initializer generated by IntelliJ IDEA GUI Designer
        // >>> IMPORTANT!! <<<
        // DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mPanel = new javax.swing.JPanel();
        mPanel.setLayout(new GridLayoutManager(7, 3, new java.awt.Insets(0, 0, 0, 0), 1, 3, false, true));
        mPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.black), "MvpConfig"));
        final javax.swing.JPanel panel1 = new javax.swing.JPanel();
        panel1.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel1,
            new GridConstraints(0, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label1 = new javax.swing.JLabel();
        java.awt.GridBagConstraints gbc;
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel1.add(label1, gbc);
        tv_v_name = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel1.add(tv_v_name, gbc);
        final javax.swing.JPanel panel2 = new javax.swing.JPanel();
        panel2.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel2, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new java.awt.Dimension(303, 56), null, 0, true));
        final javax.swing.JLabel label2 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel2.add(label2, gbc);
        tv_p_name = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel2.add(tv_p_name, gbc);
        final javax.swing.JPanel panel3 = new javax.swing.JPanel();
        panel3.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel3,
            new GridConstraints(5, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label3 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel3.add(label3, gbc);
        tv_m_name = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel3.add(tv_m_name, gbc);
        final javax.swing.JPanel panel4 = new javax.swing.JPanel();
        panel4.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel4,
            new GridConstraints(6, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label4 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel4.add(label4, gbc);
        tv_model_impl = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel4.add(tv_model_impl, gbc);
        final javax.swing.JPanel panel5 = new javax.swing.JPanel();
        panel5.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel5,
            new GridConstraints(4, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label5 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel5.add(label5, gbc);
        tv_presenter_impl = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel5.add(tv_presenter_impl, gbc);
        final javax.swing.JPanel panel6 = new javax.swing.JPanel();
        panel6.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel6,
            new GridConstraints(1, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label6 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel6.add(label6, gbc);
        tv_view_activity = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel6.add(tv_view_activity, gbc);
        final javax.swing.JPanel panel7 = new javax.swing.JPanel();
        panel7.setLayout(new java.awt.GridBagLayout());
        mPanel.add(panel7,
            new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, true));
        final javax.swing.JLabel label7 = new javax.swing.JLabel();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        panel7.add(label7, gbc);
        tv_view_fragment = new javax.swing.JTextField();
        gbc = new java.awt.GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 4.0;
        gbc.weighty = 1.0;
        gbc.anchor = java.awt.GridBagConstraints.WEST;
        gbc.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panel7.add(tv_view_fragment, gbc);
    }

    /** @noinspection ALL */
    public javax.swing.JComponent $$$getRootComponent$$$() {
        return mPanel;
    }
}
