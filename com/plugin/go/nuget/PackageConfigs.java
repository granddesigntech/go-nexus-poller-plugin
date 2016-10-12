package plugin.go.nuget;

import com.thoughtworks.go.plugin.api.request.GoPluginApiRequest;
import com.thoughtworks.go.plugin.api.response.GoPluginApiResponse;

import java.util.HashMap;
import java.util.Map;

public class PackageConfigs extends PluginConfigs{

    public Map handlePackageConfiguration() {
        Map packageConfig = new HashMap();

        packageConfig.put("PACKAGE_ID", createConfigurationField("Package ID", "0", false, true, true));
        packageConfig.put("PACKAGE_NAME", createConfigurationField("Package Name", "1", false, true, true));

        return packageConfig;
    }



    public Map handleValidatePackageConfiguration(GoPluginApiRequest goPluginApiRequest) {
        return null;
    }
}
