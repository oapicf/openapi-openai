//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateModerationResponseResultsInner {
  /// Returns a new [CreateModerationResponseResultsInner] instance.
  CreateModerationResponseResultsInner({
    required this.flagged,
    required this.categories,
    required this.categoryScores,
    required this.categoryAppliedInputTypes,
  });

  /// Whether any of the below categories are flagged.
  bool flagged;

  CreateModerationResponseResultsInnerCategories categories;

  CreateModerationResponseResultsInnerCategoryScores categoryScores;

  CreateModerationResponseResultsInnerCategoryAppliedInputTypes categoryAppliedInputTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateModerationResponseResultsInner &&
    other.flagged == flagged &&
    other.categories == categories &&
    other.categoryScores == categoryScores &&
    other.categoryAppliedInputTypes == categoryAppliedInputTypes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (flagged.hashCode) +
    (categories.hashCode) +
    (categoryScores.hashCode) +
    (categoryAppliedInputTypes.hashCode);

  @override
  String toString() => 'CreateModerationResponseResultsInner[flagged=$flagged, categories=$categories, categoryScores=$categoryScores, categoryAppliedInputTypes=$categoryAppliedInputTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'flagged'] = this.flagged;
      json[r'categories'] = this.categories;
      json[r'category_scores'] = this.categoryScores;
      json[r'category_applied_input_types'] = this.categoryAppliedInputTypes;
    return json;
  }

  /// Returns a new [CreateModerationResponseResultsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateModerationResponseResultsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateModerationResponseResultsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateModerationResponseResultsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateModerationResponseResultsInner(
        flagged: mapValueOfType<bool>(json, r'flagged')!,
        categories: CreateModerationResponseResultsInnerCategories.fromJson(json[r'categories'])!,
        categoryScores: CreateModerationResponseResultsInnerCategoryScores.fromJson(json[r'category_scores'])!,
        categoryAppliedInputTypes: CreateModerationResponseResultsInnerCategoryAppliedInputTypes.fromJson(json[r'category_applied_input_types'])!,
      );
    }
    return null;
  }

  static List<CreateModerationResponseResultsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateModerationResponseResultsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateModerationResponseResultsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateModerationResponseResultsInner> mapFromJson(dynamic json) {
    final map = <String, CreateModerationResponseResultsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateModerationResponseResultsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateModerationResponseResultsInner-objects as value to a dart map
  static Map<String, List<CreateModerationResponseResultsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateModerationResponseResultsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateModerationResponseResultsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'flagged',
    'categories',
    'category_scores',
    'category_applied_input_types',
  };
}

