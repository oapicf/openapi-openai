//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RunStepDetailsToolCallsFileSearchResultObject {
  /// Returns a new [RunStepDetailsToolCallsFileSearchResultObject] instance.
  RunStepDetailsToolCallsFileSearchResultObject({
    required this.fileId,
    required this.fileName,
    required this.score,
    this.content = const [],
  });

  /// The ID of the file that result was found in.
  String fileId;

  /// The name of the file that result was found in.
  String fileName;

  /// The score of the result. All values must be a floating point number between 0 and 1.
  ///
  /// Minimum value: 0
  /// Maximum value: 1
  num score;

  /// The content of the result that was found. The content is only included if requested via the include query parameter.
  List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RunStepDetailsToolCallsFileSearchResultObject &&
    other.fileId == fileId &&
    other.fileName == fileName &&
    other.score == score &&
    _deepEquality.equals(other.content, content);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (fileId.hashCode) +
    (fileName.hashCode) +
    (score.hashCode) +
    (content.hashCode);

  @override
  String toString() => 'RunStepDetailsToolCallsFileSearchResultObject[fileId=$fileId, fileName=$fileName, score=$score, content=$content]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'file_id'] = this.fileId;
      json[r'file_name'] = this.fileName;
      json[r'score'] = this.score;
      json[r'content'] = this.content;
    return json;
  }

  /// Returns a new [RunStepDetailsToolCallsFileSearchResultObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RunStepDetailsToolCallsFileSearchResultObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RunStepDetailsToolCallsFileSearchResultObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RunStepDetailsToolCallsFileSearchResultObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RunStepDetailsToolCallsFileSearchResultObject(
        fileId: mapValueOfType<String>(json, r'file_id')!,
        fileName: mapValueOfType<String>(json, r'file_name')!,
        score: num.parse('${json[r'score']}'),
        content: RunStepDetailsToolCallsFileSearchResultObjectContentInner.listFromJson(json[r'content']),
      );
    }
    return null;
  }

  static List<RunStepDetailsToolCallsFileSearchResultObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RunStepDetailsToolCallsFileSearchResultObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RunStepDetailsToolCallsFileSearchResultObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RunStepDetailsToolCallsFileSearchResultObject> mapFromJson(dynamic json) {
    final map = <String, RunStepDetailsToolCallsFileSearchResultObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RunStepDetailsToolCallsFileSearchResultObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RunStepDetailsToolCallsFileSearchResultObject-objects as value to a dart map
  static Map<String, List<RunStepDetailsToolCallsFileSearchResultObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RunStepDetailsToolCallsFileSearchResultObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RunStepDetailsToolCallsFileSearchResultObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'file_id',
    'file_name',
    'score',
  };
}

