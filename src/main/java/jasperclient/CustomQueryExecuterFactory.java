package jasperclient;

import net.sf.jasperreports.engine.JRDataset;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRValueParameter;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.query.AbstractQueryExecuterFactory;
import net.sf.jasperreports.engine.query.JRQueryExecuter;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: cscarioni
 * Date: 03/11/2013
 * Time: 14:18
 * To change this template use File | Settings | File Templates.
 */
public class CustomQueryExecuterFactory extends AbstractQueryExecuterFactory{
    @Override
    public Object[] getBuiltinParameters() {
        return new Object[0];
    }

    @Override
    public JRQueryExecuter createQueryExecuter(JasperReportsContext jasperReportsContext, JRDataset jrDataset, Map<String, ? extends JRValueParameter> stringMap) throws JRException {
        return new CustomJRQueryExecuter(jasperReportsContext, jrDataset, stringMap);
    }

    @Override
    public boolean supportsQueryParameterType(String s) {
        return true;
    }
}
