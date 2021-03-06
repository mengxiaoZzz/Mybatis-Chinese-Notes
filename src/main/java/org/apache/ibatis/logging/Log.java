/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.logging;

/**
 * logging包中最重要的接口
 * 相关实现类使用了适配器模式实现
 * @author Clinton Begin
 */
public interface Log {

  /**
   * 判断打印 Debug 级别日志的功能是否开启
   */
  boolean isDebugEnabled();

  /**
   * 判断打印 Trace 级别日志的功能是否开启
   */
  boolean isTraceEnabled();

  /**
   * 打印 Error 级别日志
   */
  void error(String s, Throwable e);

  /**
   * 打印 Error 级别日志
   */
  void error(String s);

  /**
   * 打印 Debug 级别日志
   */
  void debug(String s);

  /**
   * 打印 Trace 级别日志
   */
  void trace(String s);

  /**
   * 打印 Warn 级别日志
   */
  void warn(String s);

}
