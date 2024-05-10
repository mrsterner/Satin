/*
 * Satin
 * Copyright (C) 2019-2024 Ladysnake
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; If not, see <https://www.gnu.org/licenses>.
 */
package ladysnake.satin.mixin.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderPhase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderLayer.class)
public abstract class RenderLayerMixin extends RenderPhase {
    public RenderLayerMixin(String name, Runnable beginAction, Runnable endAction) {
        super(name, beginAction, endAction);
    }

    @Mixin(RenderLayer.MultiPhaseParameters.class)
    public interface MultiPhaseParametersAccessor {
        @Accessor
        TextureBase getTexture();

        @Accessor
        ShaderProgram getProgram();

        @Accessor
        Transparency getTransparency();

        @Accessor
        DepthTest getDepthTest();

        @Accessor
        Cull getCull();

        @Accessor
        Lightmap getLightmap();

        @Accessor
        Overlay getOverlay();

        @Accessor
        Layering getLayering();

        @Accessor
        Target getTarget();

        @Accessor
        Texturing getTexturing();

        @Accessor
        WriteMaskState getWriteMaskState();

        @Accessor
        LineWidth getLineWidth();

        @Accessor
        RenderLayer.OutlineMode getOutlineMode();
    }
}
