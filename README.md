# iCreate: Missile Tech

An experimental Create addon for Minecraft 1.21.1 on NeoForge.

## Alpha.1 contents
- Seven registered components: Missile Fin, Missile Thruster, Missile Fluid Tank, Missile Navigator, Missile Nose Cone, Missile Warhead, and Missile Remote.
- Provisional crafting recipes, including three diagonal iron ingots crafting four fins and an iron ingot above an iron block crafting the nose cone.
- Distinct vanilla placeholder icons and in-game tooltips that explain each component's intended role and identify unfinished behavior.
- GitHub Actions build with a downloadable development JAR artifact.

## Not implemented yet
- Assembled missile construction and launch behavior.
- Water/lava fuel and range calculations.
- Remote-controlled launches, team tagging, and orbital launches.
- Custom item textures, sounds, and in-game balancing.

## Compatibility
- Minecraft 1.21.1
- NeoForge 21.1.x (built against 21.1.251)
- Java 21
- Intended Create integration: 6.0.x

This is a development alpha, not a finished missile system. Back up worlds before testing and do not assume planned features are available.

## Build
With Java 21 and Gradle 8.12, run `gradle --no-daemon build`. GitHub Actions uploads the built JAR as a short-lived workflow artifact. Test the artifact in both a client and a dedicated server before considering a Modrinth release.

## License
MIT. See [LICENSE](LICENSE).
