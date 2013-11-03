package jasperclient;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.query.JRAbstractQueryExecuter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: cscarioni
 * Date: 03/11/2013
 * Time: 14:19
 * To change this template use File | Settings | File Templates.
 */
public class CustomJRQueryExecuter extends JRAbstractQueryExecuter {

    public CustomJRQueryExecuter(JasperReportsContext jasperReportsContext, JRDataset dataset, java.util.Map<String,? extends JRValueParameter> parametersMap){
       super(jasperReportsContext, dataset, parametersMap);
    }
    @Override
    protected String getParameterReplacement(String s) {
        return s;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JRDataSource createDatasource() throws JRException {
        ArrayList collection = new ArrayList();
        Map person1= new HashMap();
        person1.put("name", getValueParameter("PAR1").getValue().toString());
        Map person2= new HashMap();
        person2.put("name", "felipao");
        collection.add(person1);
        collection.add(person2);
        return new JRMapCollectionDataSource(collection);
    }

    @Override
    public void close() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean cancelQuery() throws JRException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
