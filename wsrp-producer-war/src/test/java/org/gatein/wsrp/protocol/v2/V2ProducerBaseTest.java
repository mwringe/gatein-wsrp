/*
 * JBoss, a division of Red Hat
 * Copyright 2010, Red Hat Middleware, LLC, and individual
 * contributors as indicated by the @authors tag. See the
 * copyright.txt in the distribution for a full listing of
 * individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.gatein.wsrp.protocol.v2;

import org.gatein.wsrp.WSRPTypeFactory;
import org.gatein.wsrp.producer.ProducerHolder;
import org.gatein.wsrp.producer.WSRPProducer;
import org.gatein.wsrp.producer.WSRPProducerBaseTest;
import org.gatein.wsrp.producer.v2.WSRP2Producer;
import org.oasis.wsrp.v2.GetServiceDescription;

/**
 * @author <a href="mailto:chris.laprun@jboss.com">Chris Laprun</a>
 * @version $Revision$
 */
public class V2ProducerBaseTest extends WSRPProducerBaseTest
{
   protected WSRP2Producer producer = ProducerHolder.getProducer(true);

   public V2ProducerBaseTest() throws Exception
   {
      this("V2ProducerBaseTest");
   }

   protected V2ProducerBaseTest(String name) throws Exception
   {
      super(name);
      producer.start();
   }

   @Override
   protected WSRPProducer getProducer()
   {
      return producer;
   }

   protected GetServiceDescription getNoRegistrationServiceDescriptionRequest()
   {
      GetServiceDescription gs = WSRPTypeFactory.createGetServiceDescription();
      gs.getDesiredLocales().add("en-US");
      gs.getDesiredLocales().add("en");
      return gs;
   }
}
