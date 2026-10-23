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

## Alpha verification checklist
- [ ] Start a client with the matching Minecraft, NeoForge, and Create versions.
- [ ] Confirm the iCreate: Missile Tech creative tab appears and all seven items have names, icons, and tooltips.
- [ ] Craft each recipe in survival and confirm output counts.
- [ ] Start a dedicated server with the same mod set and confirm startup completes.
- [ ] Check latest.log for missing model, texture, or translation warnings.

Do not submit a public Modrinth file until the client and dedicated-server checks are completed. GitHub Actions uploads the built JAR as a short-lived workflow artifact.

## Build
With Java 21 and Gradle 8.12, run `gradle --no-daemon build`.

## License
MIT. See [LICENSE](LICENSE).
