/*package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target\\cucumber.json"}
	 
)
public class RunCukesTest {
}
*/
package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\skeleton\\casestudy2.feature",glue="skeleton",
plugin={"json:target\\cucumber.json"})

public class RunCukesTest {

}

