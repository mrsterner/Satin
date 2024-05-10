package ladysnake.satin.platform;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.util.Identifier;

import java.io.IOException;

public class PlatformUtil {

    @ExpectPlatform
    public static ShaderProgram getShaderProgramClass(ResourceFactory resourceManager, Identifier location, VertexFormat vertexFormat) throws IOException {
        throw new AssertionError();
    }
}
