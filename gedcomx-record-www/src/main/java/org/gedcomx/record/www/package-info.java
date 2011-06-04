/**
 * Copyright 2011 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * The <b>record-www profile</b> models the necessary extensions to the record model to support
 * providing record data via the World Wide Web.
 *
 * @label Record WWW Profile
 */
@XmlSchema(
  namespace = RecordWWWConstants.GEDCOMX_RECORD_WWW_NAMESPACE,
  elementFormDefault = XmlNsForm.QUALIFIED
)
@XmlAccessorOrder ( XmlAccessOrder.ALPHABETICAL )
@DefaultNamespace ( RecordConstants.GEDCOMX_RECORD_NAMESPACE )
package org.gedcomx.record.www;

import org.gedcomx.record.RecordConstants;
import org.gedcomx.rt.DefaultNamespace;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
