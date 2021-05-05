/*
 * ServerListPlus - https://git.io/slp
 * Copyright (C) 2014 Minecrell (https://github.com/Minecrell)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.minecrell.serverlistplus.core.replacement.rgb;

import net.minecrell.serverlistplus.core.replacement.StaticReplacer;

public enum RGBFormat {
    UNSUPPORTED,
    ADVENTURE,
    WEIRD_BUNGEE {
        @Override
        public StaticReplacer getReplacer() {
            return WeirdBungeeRGBReplacer.INSTANCE;
        }
    };

    public StaticReplacer getReplacer() {
        return null;
    }

}
