/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apress.einusre.persistence.pao;

import java.sql.Types;
import java.util.Map;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

/**
 *
 * @author DKAYAL
 */
public class SaveNewLeadPao extends StoredProcedure{
    public SaveNewLeadPao(){
        declareParameter(new SqlOutParameter("pLeadId", Types.INTEGER));
        declareParameter(new SqlParameter("pName", Types.VARCHAR));
        declareParameter(new SqlParameter("pCountryCd", Types.VARCHAR));
    }
    public Map execute(Map inParamMap){
        return this.execute(inParamMap);
    }
}
