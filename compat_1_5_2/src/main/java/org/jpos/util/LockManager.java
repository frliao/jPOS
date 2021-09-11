/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.util;

/*
 * $Log$
 * Revision 1.4  2003/10/13 10:46:16  apr
 * tabs expanded to spaces
 *
 * Revision 1.3  2000/11/02 12:09:18  apr
 * Added license to every source file
 *
 * Revision 1.2  2000/03/01 14:44:45  apr
 * Changed package name to org.jpos
 *
 * Revision 1.1  2000/01/30 23:32:52  apr
 * pre-Alpha - CVS sync
 *
 */

/**
 * @author apr@cs.com.uy
 * @since jPOS 1.1
 * @version $Id$
 */
public interface LockManager {
    interface Ticket {
        boolean renew(long duration);
        long getExpiration();
        boolean isExpired();
        void cancel();
    }
    Ticket lock(String resourceName, long duration, long wait);
}
    
