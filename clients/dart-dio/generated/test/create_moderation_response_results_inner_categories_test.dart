import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateModerationResponseResultsInnerCategories
void main() {
  final instance = CreateModerationResponseResultsInnerCategoriesBuilder();
  // TODO add properties to the builder and call build()

  group(CreateModerationResponseResultsInnerCategories, () {
    // Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
    // bool hate
    test('to test the property `hate`', () async {
      // TODO
    });

    // Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
    // bool hateSlashThreatening
    test('to test the property `hateSlashThreatening`', () async {
      // TODO
    });

    // Content that expresses, incites, or promotes harassing language towards any target.
    // bool harassment
    test('to test the property `harassment`', () async {
      // TODO
    });

    // Harassment content that also includes violence or serious harm towards any target.
    // bool harassmentSlashThreatening
    test('to test the property `harassmentSlashThreatening`', () async {
      // TODO
    });

    // Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
    // bool illicit
    test('to test the property `illicit`', () async {
      // TODO
    });

    // Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
    // bool illicitSlashViolent
    test('to test the property `illicitSlashViolent`', () async {
      // TODO
    });

    // Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
    // bool selfHarm
    test('to test the property `selfHarm`', () async {
      // TODO
    });

    // Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
    // bool selfHarmSlashIntent
    test('to test the property `selfHarmSlashIntent`', () async {
      // TODO
    });

    // Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
    // bool selfHarmSlashInstructions
    test('to test the property `selfHarmSlashInstructions`', () async {
      // TODO
    });

    // Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
    // bool sexual
    test('to test the property `sexual`', () async {
      // TODO
    });

    // Sexual content that includes an individual who is under 18 years old.
    // bool sexualSlashMinors
    test('to test the property `sexualSlashMinors`', () async {
      // TODO
    });

    // Content that depicts death, violence, or physical injury.
    // bool violence
    test('to test the property `violence`', () async {
      // TODO
    });

    // Content that depicts death, violence, or physical injury in graphic detail.
    // bool violenceSlashGraphic
    test('to test the property `violenceSlashGraphic`', () async {
      // TODO
    });

  });
}
