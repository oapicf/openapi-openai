//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFileSearchObjectFileSearch {
  /// Returns a new [RunStepDetailsToolCallsFileSearchObjectFileSearch] instance.
  RunStepDetailsToolCallsFileSearchObjectFileSearch({
    this.rankingOptions,
    this.results = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  RunStepDetailsToolCallsFileSearchRankingOptionsObject? rankingOptions;

  /// The results of the file search.
  List<RunStepDetailsToolCallsFileSearchResultObject> results;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFileSearchObjectFileSearch &&
    other.rankingOptions == rankingOptions &&
    _deepEquality.equals(other.results, results);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rankingOptions == null ? 0 : rankingOptions!.hashCode) +
    (results.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFileSearchObjectFileSearch[rankingOptions=$rankingOptions, results=$results]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.rankingOptions != null) {
      json[r'ranking_options'] = this.rankingOptions;
    } else {
      json[r'ranking_options'] = null;
    }
      json[r'results'] = this.results;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFileSearchObjectFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFileSearchObjectFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsFileSearchObjectFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsFileSearchObjectFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsFileSearchObjectFileSearch(
        rankingOptions: RunStepDetailsToolCallsFileSearchRankingOptionsObject.fromJson(json[r'ranking_options']),
        results: RunStepDetailsToolCallsFileSearchResultObject.listFromJson(json[r'results']),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFileSearchObjectFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchObjectFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFileSearchObjectFileSearch> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFileSearchObjectFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFileSearchObjectFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFileSearchObjectFileSearch-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFileSearchObjectFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFileSearchObjectFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFileSearchObjectFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

