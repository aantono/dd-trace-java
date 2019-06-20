import datadog.trace.agent.test.log.injection.LogContextInjectionTest
import org.apache.logging.log4j.ThreadContext

class Log4jThreadContextTest extends LogContextInjectionTest {

  @Override
  def put(String key, Object value) {
    return ThreadContext.put(key, value as String)
  }

  @Override
  def get(String key) {
    return ThreadContext.get(key)
  }
}
