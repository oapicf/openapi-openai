//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantToolsFileSearchFileSearch {
  /// Returns a new [AssistantToolsFileSearchFileSearch] instance.
  AssistantToolsFileSearchFileSearch({
    this.maxNumResults,
    this.rankingOptions,
  });

  /// The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  ///
  /// Minimum value: 1
  /// Maximum value: 50
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? maxNumResults;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  FileSearchRankingOptions? rankingOptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantToolsFileSearchFileSearch &&
    other.maxNumResults == maxNumResults &&
    other.rankingOptions == rankingOptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxNumResults == null ? 0 : maxNumResults!.hashCode) +
    (rankingOptions == null ? 0 : rankingOptions!.hashCode);

  @override
  String toString() => 'AssistantToolsFileSearchFileSearch[maxNumResults=$maxNumResults, rankingOptions=$rankingOptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxNumResults != null) {
      json[r'max_num_results'] = this.maxNumResults;
    } else {
      json[r'max_num_results'] = null;
    }
    if (this.rankingOptions != null) {
      json[r'ranking_options'] = this.rankingOptions;
    } else {
      json[r'ranking_options'] = null;
    }
    return json;
  }

  /// Returns a new [AssistantToolsFileSearchFileSearch] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantToolsFileSearchFileSearch? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantToolsFileSearchFileSearch[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantToolsFileSearchFileSearch[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantToolsFileSearchFileSearch(
        maxNumResults: mapValueOfType<int>(json, r'max_num_results'),
        rankingOptions: FileSearchRankingOptions.fromJson(json[r'ranking_options']),
      );
    }
    return null;
  }

  static List<AssistantToolsFileSearchFileSearch> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantToolsFileSearchFileSearch>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantToolsFileSearchFileSearch.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantToolsFileSearchFileSearch> mapFromJson(dynamic json) {
    final map = <String, AssistantToolsFileSearchFileSearch>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantToolsFileSearchFileSearch.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantToolsFileSearchFileSearch-objects as value to a dart map
  static Map<String, List<AssistantToolsFileSearchFileSearch>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantToolsFileSearchFileSearch>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantToolsFileSearchFileSearch.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

