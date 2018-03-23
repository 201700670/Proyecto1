/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.LinkedList;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Andrea Palomo
 */
public class Modelotabla implements TableModel{

    public Modelotabla(){
        this.agregarusuario(new Datosusuario("Nombre", "Apellido", "Usuario","Rol", "ID", "Contraseña"));
    }
    @Override
    public int getColumnCount() {
        // Devuelve el número de columnas del modelo, que coincide con el
        // número de datos que tenemos de cada persona.
        return 7;
    }
    
    /** Returns the number of rows in the model. A
     * <code>JTable</code> uses this method to determine how many rows it
     * should display.  This method should be quick, as it
     * is called frequently during rendering.
     *
     * @return the number of rows in the model
     * @see #getColumnCount
     *
     */
    @Override
    public int getRowCount() {
        // Devuelve el número de personas en el modelo, es decir, el número
        // de filas en la tabla.
        return datos.size();
    }
    
    /** Returns the value for the cell at <code>columnIndex</code> and
     * <code>rowIndex</code>.
     *
     * @param	rowIndex	the row whose value is to be queried
     * @param	columnIndex 	the column whose value is to be queried
     * @return	the value Object at the specified cell
     *
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Datosusuario aux;
        
        // Se obtiene la persona de la fila indicada
        aux = (Datosusuario)(datos.get(rowIndex));
        
        // Se obtiene el campo apropiado según el valor de columnIndex
        switch (columnIndex)
        {
            case 0:
                
                if(rowIndex==0){
                    return "No";
                }
                else{
                    
                return rowIndex;
                }
            case 1:
                return aux.getId();
            case 2:
                return aux.getNombre();
            case 3:
                return aux.getApellido();
            case 4:
                return aux.getUsuario();
            case 5:
                return aux.getRol();
            case 6:
                    return aux.getContrasena();
            default:
                return null;
        }
    }
    
    /**;
     * Borra del modelo la persona en la fila indicada 
     * @param fila
     */
    public void borrarusuario (int fila)
    {
        // Se borra la fila 
        datos.remove(fila);
        
        // Y se avisa a los suscriptores, creando un TableModelEvent...
        TableModelEvent evento = new TableModelEvent (this, fila, fila, 
            TableModelEvent.ALL_COLUMNS, TableModelEvent.DELETE);
        
        // ... y pasándoselo a los suscriptores
        avisaSuscriptores (evento);
    }
    
    /**
     * Añade una persona al final de la tabla
     * @param nuevaPersona
     */
    public void agregarusuario (Datosusuario nuevaPersona)
    {
        // Añade la persona al modelo 
        datos.add (nuevaPersona);
        
        // Avisa a los suscriptores creando un TableModelEvent...
        TableModelEvent evento;
        evento = new TableModelEvent (this, this.getRowCount()-1,
            this.getRowCount()-1, TableModelEvent.ALL_COLUMNS,
            TableModelEvent.INSERT);

        // ... y avisando a los suscriptores
        avisaSuscriptores (evento);
    }
    
    /** Adds a listener to the list that is notified each time a change
     * to the data model occurs.
     *
     * @param	l		the TableModelListener
     *
     */
    @Override
    public void addTableModelListener(TableModelListener l) {
        // Añade el suscriptor a la lista de suscriptores
        listeners.add (l);
    }
    
    /** Returns the most specific superclass for all the cell values
     * in the column.  This is used by the <code>JTable</code> to set up a
     * default renderer and editor for the column.
     *
     * @param columnIndex  the index of the column
     * @return the common ancestor class of the object values in the model.
     *
     */
    @Override
    public Class getColumnClass(int columnIndex) {
        // Devuelve la clase que hay en cada columna.
        switch (columnIndex)
        {
            case 0:
                // La columna cero contiene el nombre de la persona, que es
                // un String
                return Integer.class;
            case 1:
                // La columna uno contiene el apellido de la persona, que es
                // un String
                return String.class;
            case 2:
                // La columna dos contine la edad de la persona, que es un
                // Integer (no vale int, debe ser una clase)
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
                case 6:
                    return String.class;
            default:
                // Devuelve una clase Object por defecto.
                return Object.class;
        }
    }
    
    /** Returns the name of the column at <code>columnIndex</code>.  This is used
     * to initialize the table's column header name.  Note: this name does
     * not need to be unique; two columns in a table can have the same name.
     *
     * @param	columnIndex	the index of the column
     * @return  the name of the column
     *
     */
    @Override
    public String getColumnName(int columnIndex) 
    {
        // Devuelve el nombre de cada columna. Este texto aparecerá en la
        // cabecera de la tabla.
        switch (columnIndex)
        {
            case 0:
                return "No.";
            case 1:
                return "ID";
            case 2:
                return "Nombre";
            case 3:
                return "Apellido";
            case 4:
                return "Usuario";
            case 5:
                return "Rol";
            case 6:
                return "Contraseña";
            default:
                return null;
        }
    }
    
    /** Returns true if the cell at <code>rowIndex</code> and
     * <code>columnIndex</code>
     * is editable.  Otherwise, <code>setValueAt</code> on the cell will not
     * change the value of that cell.
     *
     * @param	rowIndex	the row whose value to be queried
     * @param	columnIndex	the column whose value to be queried
     * @return	true if the cell is editable
     * @see #setValueAt
     *
     */
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permite que la celda sea editable.
        return true;
    }
    
    /** Removes a listener from the list that is notified each time a
     * change to the data model occurs.
     *
     * @param	l		the TableModelListener
     *
     */
    @Override
    public void removeTableModelListener(TableModelListener l) {
        // Elimina los suscriptores.
        listeners.remove(l);
    }
    
    /** Sets the value in the cell at <code>columnIndex</code> and
     * <code>rowIndex</code> to <code>aValue</code>.
     *
     * @param	aValue		 the new value
     * @param	rowIndex	 the row whose value is to be changed
     * @param	columnIndex 	 the column whose value is to be changed
     * @see #getValueAt
     * @see #isCellEditable
     *
     */
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) 
    {
        // Obtiene la persona de la fila indicada
        Datosusuario aux;
        
        aux = (Datosusuario)(datos.get(rowIndex));
        String no="No.";
        // Cambia el campo de Persona que indica columnIndex, poniendole el 
        // aValue que se nos pasa.
        switch (columnIndex)
        {
            case 0:
                if(rowIndex==0){
//                        aux.no();
                }
                else{
                    String.valueOf(rowIndex+2);
                }
                
                break;
            case 1:
                aux.getId();
                
                break;
            case 2:
                aux.getNombre();
                
                break;
            case 3:
                aux.getApellido();
                break;
            case 4:
                aux.getUsuario();
            break;
            case 5:
                aux.getRol();
                break;
            case 6:
                aux.getContrasena();
                break;
            
           
            default:
                break;
        }
        
        // Avisa a los suscriptores del cambio, creando un TableModelEvent ...
        TableModelEvent evento = new TableModelEvent (this, rowIndex, rowIndex, 
            columnIndex);

        // ... y pasándoselo a los suscriptores.
        avisaSuscriptores (evento);
    }
    
    /**
     * Pasa a los suscriptores el evento.
     */
    private void avisaSuscriptores (TableModelEvent evento)
    {
        int i;
        
        // Bucle para todos los suscriptores en la lista, se llama al metodo
        // tableChanged() de los mismos, pasándole el evento.
        for (i=0; i<listeners.size(); i++)
            ((TableModelListener)listeners.get(i)).tableChanged(evento);
    }
    
    /** Lista con los datos. Cada elemento de la lista es una instancia de
     * Persona */
    private final LinkedList datos = new LinkedList();
    
    /** Lista de suscriptores. El JTable será un suscriptor de este modelo de
     * datos */
    private final LinkedList listeners = new LinkedList();
}