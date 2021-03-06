/**
 * Copyright 2009-2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.reflection.factory;

import java.util.List;
import java.util.Properties;

/**
 * 中文注释: 对象工厂
 * <p>
 * MyBatis uses an ObjectFactory to create all needed new Objects.
 *
 * @author Clinton Begin
 */
public interface ObjectFactory {

  /**
   * 中文注释: 设置工厂的属性
   * <p>
   * Sets configuration properties.
   *
   * @param properties configuration properties
   */
  default void setProperties(Properties properties) {
    // NOP
  }

  /**
   * 中文注释: 传入一个类型,采用无参构造方法生成这个类型的实例
   * <p>
   * Creates a new object with default constructor.
   *
   * @param <T>  the generic type
   * @param type Object type
   * @return the t
   */
  <T> T create(Class<T> type);

  /**
   * 中文注释: 传入一个目标类型、一个参数类型列表、一个参数值列表,根据参数列表找到相应的含参构造方法生成这个类型的实例
   * <p>
   * Creates a new object with the specified constructor and params.
   *
   * @param <T>                 the generic type
   * @param type                Object type
   * @param constructorArgTypes Constructor argument types
   * @param constructorArgs     Constructor argument values
   * @return the t
   */
  <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs);

  /**
   * 中文注释: 判断传入的类型是否是集合类
   * <p>
   * Returns true if this object can have a set of other objects.
   * It's main purpose is to support non-java.util.Collection objects like Scala collections.
   *
   * @param <T>  the generic type
   * @param type Object type
   * @return whether it is a collection or not
   * @since 3.1.0
   */
  <T> boolean isCollection(Class<T> type);

}
