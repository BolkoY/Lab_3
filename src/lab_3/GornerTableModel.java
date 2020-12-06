package lab_3;

import javax.swing.table.AbstractTableModel;

public class GornerTableModel extends AbstractTableModel {
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;
    public GornerTableModel(Double from, Double to, Double step, Double[]coefficients) {

        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }
    public Double getFrom() {
        return from;    
    }
    public Double getTo() {
        return to;
    }
    public Double getStep() {
        return step;
    }

    public int getColumnCount() {
        return 2;
    }

    public int getRowCount() {
        // Вычислить количество точек между началом и концом отрезка
        // исходя из шага табулирования
        return new Double(Math.ceil((to-from)/step)).intValue()+1;
    }


    //!!!!!!!!!!!!!!!
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    public Object getValueAt(int row, int col){
        //вычислить Х как начало_отрезка + шаг * номер_строки
        double x = from + step * row;
                return x;
            
        
    }
    public Class<?> getColumnClass(int col) {
        //и в 1-ом и во 2-ом столбце находятся значения типа Double в 3 Boolean
        switch (col){
            case 2:
                return Boolean.class;
            default:
                return Double.class;
        }
    }

    public String getColumnName(int col) {
        switch (col){
            case 0:
                return "Значение Х";
            case 1:
                return "Значение многчлена";
            default:
                return "Значение больше нуля?";
        }
    }
}
