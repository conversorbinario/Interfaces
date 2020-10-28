/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novataboa.modeloTabla;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.AbstractCellEditor;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author a19manuelgp
 */
public class DateCellEditor extends AbstractCellEditor implements TableCellEditor {

    private JSpinner spinner;

    public DateCellEditor(String dateFormatPattern) {

        SpinnerDateModel dateModel = new SpinnerDateModel(new Date(), null, null, Calendar.DAY_OF_MONTH);
        spinner = new JSpinner(dateModel);
        spinner.setEditor(new JSpinner.DateEditor(spinner, dateFormatPattern));
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        spinner.setValue(value);
        return spinner;
    }

    @Override
    public Object getCellEditorValue() {
        return spinner.getValue();
    }

  

}
