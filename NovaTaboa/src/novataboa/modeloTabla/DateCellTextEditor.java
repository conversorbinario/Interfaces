package novataboa.modeloTabla;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;

/**
 * DateCellEditor that is based on {@link JFormattedTextField}.
 */
public class DateCellTextEditor extends DefaultCellEditor {

    /**
     * Creates new instance of the DateCellEditor.
     * @param format date format (set lenient to false to force date validation)
     */
    public DateCellTextEditor(DateFormat format) {

        super(new JFormattedTextField(format));

        JFormattedTextField component = (JFormattedTextField) getComponent();

        //override the protected delegate
        delegate = new EditorDelegate() {

            @Override
            public void setValue(Object value) {

                component.setBorder(new LineBorder(Color.black));
                component.setValue(value);
            }

            @Override
            public boolean stopCellEditing() {

                try {
                    component.commitEdit();
                    super.stopCellEditing();
                    return true;
                } catch (ParseException e) {
                    component.setBorder(new LineBorder(Color.red));
                    return false;
                }
            }

            @Override
            public Object getCellEditorValue() {

                return component.getValue();
            }
        };

    }

}