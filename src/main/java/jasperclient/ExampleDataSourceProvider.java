package jasperclient;

import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.*;

/**
 * Data source provider implementation that
 * provides a bean collection data source
 * containing instances of Person class.
 */
public class ExampleDataSourceProvider extends
        JRAbstractBeanDataSourceProvider {

    public ExampleDataSourceProvider() {
        super(Person.class);
    }

    public JRDataSource create(JasperReport report)
            throws JRException {

        ArrayList collection = new ArrayList();
        collection.add(new Person("Teodor", "Danciu"));
        collection.add(new Person("Peter", "Severin"));
        return new JRBeanCollectionDataSource(collection);
    }

    public void dispose(JRDataSource dataSource)
            throws JRException {
        // nothing to dispose
    }

}
