package ladysnake.satin.platform.forge;

import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.util.Identifier;

import java.io.IOException;

public class PlatformUtilImpl {

    public static ShaderProgram getShaderProgramClass(ResourceFactory resourceManager, Identifier location, VertexFormat vertexFormat) throws IOException {
        return new ShaderProgram(resourceManager, location, vertexFormat);
    }
}
