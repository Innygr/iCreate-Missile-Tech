# iCreate: Missile Tech

An experimental addon for Create on Minecraft 1.21.1 (NeoForge).

## First alpha scope
- Reproducible NeoForge build and installable mod entry point.
- Initial component registry: missile fins, thruster, fluid tank, navigator, nose cone, warhead, and remote.
- Assembled missile behavior, fuel/range rules, team tags, recipes, and orbital launches remain planned follow-up work and are **not claimed complete** in this bootstrap build.

## Development
- Minecraft 1.21.1; NeoForge 21.1.x; Java 21
- Intended integration: Create 6.0.x

This is an early development snapshot. Do not treat it as a finished missile system or use it in important worlds without backups. Items are registered for testing; visual assets and gameplay behavior still need implementation.

GitHub Actions builds on pushes and pull requests. Use Gradle 8.12 with Java 21 and run `gradle build`.

## License
See [LICENSE](LICENSE).
