package javag.pokerun.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the opening class of the plugin.
 * @author gekocaretaker
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
	/**
	 * The identifier of the plugin.
	 * This is required.
	 */
	public String identifier();
	/**
	 * The plugin type. This is used for telling what should be done with the plugin.
	 * This is required.
	 */
	public PluginType pluginType();
	/**
	 * If there are any plugins that uses this plugin, those will load after this one.
	 * This is optional.
	 */
	public String[] dependants() default "null";
	/**
	 * If there are any dependencies that this plugin uses, those will load before this one.
	 * This is optional.
	 */
	public String[] dependencies() default "null";
}
