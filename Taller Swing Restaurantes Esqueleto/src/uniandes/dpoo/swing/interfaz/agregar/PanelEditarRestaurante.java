package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        this.setLayout(new GridLayout(3, 1, 10, 10));
        JPanel panelInd1 = new JPanel();
        JPanel panelInd2 = new JPanel();
        JPanel panelInd3 = new JPanel();

        panelInd1.setLayout(new GridLayout(1,2));
        panelInd2.setLayout(new GridLayout(1,2));
        panelInd3.setLayout(new GridLayout(1,2));

        // Crea el campo para el nombre con una etiqueta al frente
    	JLabel nombreRestaurante = new JLabel("Nombre:    ");
    	txtNombre = new JTextField();
    	panelInd1.add(nombreRestaurante);
    	panelInd1.add(txtNombre);
    	
        // Crea el selector para la calificación con una etiqueta al frente
    	JLabel calificacionLabel = new JLabel("Calificación:    ");
    	this.cbbCalificacion = new JComboBox();
        String[] ratings = {"1", "2", "3", "4", "5"}; // Opciones de calificación
        for(String elements : ratings) {
        	cbbCalificacion.addItem(elements);
        }
    	
    	panelInd2.add(calificacionLabel);
    	panelInd2.add(cbbCalificacion);

        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
    	JLabel visitedLabel = new JLabel("Visitado:    ");
        String[] visited = {"Si", "No"}; // Opciones de calificación

    	this.cbbVisitado = new JComboBox<String>();
    	for(String element : visited)
    	{
    		cbbVisitado.addItem(element);
    	}	
    	panelInd3.add(visitedLabel);
    	panelInd3.add(cbbVisitado);

        // Agregar todos los elementos al panel
    	this.add(panelInd1);
    	this.add(panelInd2);
    	this.add(panelInd3);
    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        return cbbVisitado.getSelectedItem().equals("Sí");
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        return txtNombre.getText();
    }
}
