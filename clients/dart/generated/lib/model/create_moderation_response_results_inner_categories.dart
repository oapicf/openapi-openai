//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationResponseResultsInnerCategories {
  /// Returns a new [CreateModerationResponseResultsInnerCategories] instance.
  CreateModerationResponseResultsInnerCategories({
    required this.hate,
    required this.hateSlashThreatening,
    required this.harassment,
    required this.harassmentSlashThreatening,
    required this.illicit,
    required this.illicitSlashViolent,
    required this.selfHarm,
    required this.selfHarmSlashIntent,
    required this.selfHarmSlashInstructions,
    required this.sexual,
    required this.sexualSlashMinors,
    required this.violence,
    required this.violenceSlashGraphic,
  });

  /// Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  bool hate;

  /// Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  bool hateSlashThreatening;

  /// Content that expresses, incites, or promotes harassing language towards any target.
  bool harassment;

  /// Harassment content that also includes violence or serious harm towards any target.
  bool harassmentSlashThreatening;

  /// Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
  bool illicit;

  /// Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
  bool illicitSlashViolent;

  /// Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  bool selfHarm;

  /// Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  bool selfHarmSlashIntent;

  /// Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  bool selfHarmSlashInstructions;

  /// Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  bool sexual;

  /// Sexual content that includes an individual who is under 18 years old.
  bool sexualSlashMinors;

  /// Content that depicts death, violence, or physical injury.
  bool violence;

  /// Content that depicts death, violence, or physical injury in graphic detail.
  bool violenceSlashGraphic;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationResponseResultsInnerCategories &&
    other.hate == hate &&
    other.hateSlashThreatening == hateSlashThreatening &&
    other.harassment == harassment &&
    other.harassmentSlashThreatening == harassmentSlashThreatening &&
    other.illicit == illicit &&
    other.illicitSlashViolent == illicitSlashViolent &&
    other.selfHarm == selfHarm &&
    other.selfHarmSlashIntent == selfHarmSlashIntent &&
    other.selfHarmSlashInstructions == selfHarmSlashInstructions &&
    other.sexual == sexual &&
    other.sexualSlashMinors == sexualSlashMinors &&
    other.violence == violence &&
    other.violenceSlashGraphic == violenceSlashGraphic;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (hate.hashCode) +
    (hateSlashThreatening.hashCode) +
    (harassment.hashCode) +
    (harassmentSlashThreatening.hashCode) +
    (illicit.hashCode) +
    (illicitSlashViolent.hashCode) +
    (selfHarm.hashCode) +
    (selfHarmSlashIntent.hashCode) +
    (selfHarmSlashInstructions.hashCode) +
    (sexual.hashCode) +
    (sexualSlashMinors.hashCode) +
    (violence.hashCode) +
    (violenceSlashGraphic.hashCode);

  @override
  String toString() => 'CreateModerationResponseResultsInnerCategories[hate=$hate, hateSlashThreatening=$hateSlashThreatening, harassment=$harassment, harassmentSlashThreatening=$harassmentSlashThreatening, illicit=$illicit, illicitSlashViolent=$illicitSlashViolent, selfHarm=$selfHarm, selfHarmSlashIntent=$selfHarmSlashIntent, selfHarmSlashInstructions=$selfHarmSlashInstructions, sexual=$sexual, sexualSlashMinors=$sexualSlashMinors, violence=$violence, violenceSlashGraphic=$violenceSlashGraphic]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'hate'] = this.hate;
      json[r'hate/threatening'] = this.hateSlashThreatening;
      json[r'harassment'] = this.harassment;
      json[r'harassment/threatening'] = this.harassmentSlashThreatening;
      json[r'illicit'] = this.illicit;
      json[r'illicit/violent'] = this.illicitSlashViolent;
      json[r'self-harm'] = this.selfHarm;
      json[r'self-harm/intent'] = this.selfHarmSlashIntent;
      json[r'self-harm/instructions'] = this.selfHarmSlashInstructions;
      json[r'sexual'] = this.sexual;
      json[r'sexual/minors'] = this.sexualSlashMinors;
      json[r'violence'] = this.violence;
      json[r'violence/graphic'] = this.violenceSlashGraphic;
    return json;
  }

  /// Returns a new [CreateModerationResponseResultsInnerCategories] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationResponseResultsInnerCategories? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateModerationResponseResultsInnerCategories[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateModerationResponseResultsInnerCategories[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateModerationResponseResultsInnerCategories(
        hate: mapValueOfType<bool>(json, r'hate')!,
        hateSlashThreatening: mapValueOfType<bool>(json, r'hate/threatening')!,
        harassment: mapValueOfType<bool>(json, r'harassment')!,
        harassmentSlashThreatening: mapValueOfType<bool>(json, r'harassment/threatening')!,
        illicit: mapValueOfType<bool>(json, r'illicit')!,
        illicitSlashViolent: mapValueOfType<bool>(json, r'illicit/violent')!,
        selfHarm: mapValueOfType<bool>(json, r'self-harm')!,
        selfHarmSlashIntent: mapValueOfType<bool>(json, r'self-harm/intent')!,
        selfHarmSlashInstructions: mapValueOfType<bool>(json, r'self-harm/instructions')!,
        sexual: mapValueOfType<bool>(json, r'sexual')!,
        sexualSlashMinors: mapValueOfType<bool>(json, r'sexual/minors')!,
        violence: mapValueOfType<bool>(json, r'violence')!,
        violenceSlashGraphic: mapValueOfType<bool>(json, r'violence/graphic')!,
      );
    }
    return null;
  }

  static List<CreateModerationResponseResultsInnerCategories> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategories>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategories.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationResponseResultsInnerCategories> mapFromJson(dynamic json) {
    final map = <String, CreateModerationResponseResultsInnerCategories>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationResponseResultsInnerCategories.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationResponseResultsInnerCategories-objects as value to a dart map
  static Map<String, List<CreateModerationResponseResultsInnerCategories>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationResponseResultsInnerCategories>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationResponseResultsInnerCategories.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'hate',
    'hate/threatening',
    'harassment',
    'harassment/threatening',
    'illicit',
    'illicit/violent',
    'self-harm',
    'self-harm/intent',
    'self-harm/instructions',
    'sexual',
    'sexual/minors',
    'violence',
    'violence/graphic',
  };
}

