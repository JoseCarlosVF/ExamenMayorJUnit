/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author User
 */
@RunWith(value=Suite.class)
@Suite.SuiteClasses(
        {
            prestamo.PrestamoABBorTest.class,
            prestamo.PrestamoACBCBorTest.class,
            prestamo.PrestamoBasicBorTest.class,
        }
)
public class PrestamoSuite {
    
}
