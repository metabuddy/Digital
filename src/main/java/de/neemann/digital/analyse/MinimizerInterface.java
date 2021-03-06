package de.neemann.digital.analyse;

import de.neemann.digital.analyse.expression.ExpressionException;
import de.neemann.digital.analyse.expression.Variable;
import de.neemann.digital.analyse.expression.format.FormatterException;
import de.neemann.digital.analyse.quinemc.BoolTable;
import de.neemann.digital.gui.components.table.ExpressionListener;

import java.util.List;

/**
 * Interface to abstract a minimizer algorithm.
 * Created by hneemann on 13.03.17.
 */
public interface MinimizerInterface {

    /**
     * Called to minimize a bool table
     *
     * @param vars       the variables used
     * @param boolTable  the bool table
     * @param resultName name of the result
     * @param listener   the listener to report the result to
     * @throws ExpressionException ExpressionException
     * @throws FormatterException FormatterException
     */
    void minimize(List<Variable> vars, BoolTable boolTable, String resultName, ExpressionListener listener) throws ExpressionException, FormatterException;

}
