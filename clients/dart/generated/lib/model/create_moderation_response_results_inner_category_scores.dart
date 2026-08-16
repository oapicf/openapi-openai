//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationResponseResultsInnerCategoryScores {
  /// Returns a new [CreateModerationResponseResultsInnerCategoryScores] instance.
  CreateModerationResponseResultsInnerCategoryScores({
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

  /// The score for the category 'hate'.
  num hate;

  /// The score for the category 'hate/threatening'.
  num hateSlashThreatening;

  /// The score for the category 'harassment'.
  num harassment;

  /// The score for the category 'harassment/threatening'.
  num harassmentSlashThreatening;

  /// The score for the category 'illicit'.
  num illicit;

  /// The score for the category 'illicit/violent'.
  num illicitSlashViolent;

  /// The score for the category 'self-harm'.
  num selfHarm;

  /// The score for the category 'self-harm/intent'.
  num selfHarmSlashIntent;

  /// The score for the category 'self-harm/instructions'.
  num selfHarmSlashInstructions;

  /// The score for the category 'sexual'.
  num sexual;

  /// The score for the category 'sexual/minors'.
  num sexualSlashMinors;

  /// The score for the category 'violence'.
  num violence;

  /// The score for the category 'violence/graphic'.
  num violenceSlashGraphic;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationResponseResultsInnerCategoryScores &&
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
  String toString() => 'CreateModerationResponseResultsInnerCategoryScores[hate=$hate, hateSlashThreatening=$hateSlashThreatening, harassment=$harassment, harassmentSlashThreatening=$harassmentSlashThreatening, illicit=$illicit, illicitSlashViolent=$illicitSlashViolent, selfHarm=$selfHarm, selfHarmSlashIntent=$selfHarmSlashIntent, selfHarmSlashInstructions=$selfHarmSlashInstructions, sexual=$sexual, sexualSlashMinors=$sexualSlashMinors, violence=$violence, violenceSlashGraphic=$violenceSlashGraphic]';

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

  /// Returns a new [CreateModerationResponseResultsInnerCategoryScores] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationResponseResultsInnerCategoryScores? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateModerationResponseResultsInnerCategoryScores[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateModerationResponseResultsInnerCategoryScores[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateModerationResponseResultsInnerCategoryScores(
        hate: num.parse('${json[r'hate']}'),
        hateSlashThreatening: num.parse('${json[r'hate/threatening']}'),
        harassment: num.parse('${json[r'harassment']}'),
        harassmentSlashThreatening: num.parse('${json[r'harassment/threatening']}'),
        illicit: num.parse('${json[r'illicit']}'),
        illicitSlashViolent: num.parse('${json[r'illicit/violent']}'),
        selfHarm: num.parse('${json[r'self-harm']}'),
        selfHarmSlashIntent: num.parse('${json[r'self-harm/intent']}'),
        selfHarmSlashInstructions: num.parse('${json[r'self-harm/instructions']}'),
        sexual: num.parse('${json[r'sexual']}'),
        sexualSlashMinors: num.parse('${json[r'sexual/minors']}'),
        violence: num.parse('${json[r'violence']}'),
        violenceSlashGraphic: num.parse('${json[r'violence/graphic']}'),
      );
    }
    return null;
  }

  static List<CreateModerationResponseResultsInnerCategoryScores> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInnerCategoryScores>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInnerCategoryScores.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationResponseResultsInnerCategoryScores> mapFromJson(dynamic json) {
    final map = <String, CreateModerationResponseResultsInnerCategoryScores>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationResponseResultsInnerCategoryScores.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationResponseResultsInnerCategoryScores-objects as value to a dart map
  static Map<String, List<CreateModerationResponseResultsInnerCategoryScores>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationResponseResultsInnerCategoryScores>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationResponseResultsInnerCategoryScores.listFromJson(entry.value, growable: growable,);
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

