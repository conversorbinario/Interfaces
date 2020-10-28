/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novataboa.modeloTabla;

import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import novataboa.dto.Alumno;

/**
 *
 * @author manuel
 */
public class StudentTableModelGeneric extends GenericDomainTableModel<Alumno> {

    public StudentTableModelGeneric() {
        this.setColumnIdentifiers(Arrays.asList(new String[]{"Nome", "Apelidos", "Curso", "Data Alta"}));

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Date.class;
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return super.getDomainObject(rowIndex).getNome();
                
            case 1:
                return super.getDomainObject(rowIndex).getApelidos();

            case 2:
                return super.getDomainObject(rowIndex).getCurso();
            case 3:
                return super.getDomainObject(rowIndex).getDataAlta();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        Alumno alum = super.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0:
                alum.setNome((String) aValue);
                break;
            case 1:
                alum.setApelidos((String) aValue);
                break;
            case 2:
                alum.setCurso((String) aValue);
                break;
            case 3: {
                alum.setDataAlta((Date)aValue);
                break;
            }

            default:
                break;
        }

        notifyTableCellUpdated(rowIndex, columnIndex); // NO olvidar!!!

    }

    //Non se usan outras ventas!
    @Override
    public boolean isCellEditable(int i, int i1) {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

    /*  @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        if(value instanceof Date)
    } */
   

}
