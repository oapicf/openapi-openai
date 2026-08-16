//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SubmitToolOutputsRunRequest {
  /// Returns a new [SubmitToolOutputsRunRequest] instance.
  SubmitToolOutputsRunRequest({
    this.toolOutputs = const [],
    this.stream,
  });

  /// A list of tools for which the outputs are being submitted.
  List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs;

  /// If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  bool? stream;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SubmitToolOutputsRunRequest &&
    _deepEquality.equals(other.toolOutputs, toolOutputs) &&
    other.stream == stream;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (toolOutputs.hashCode) +
    (stream == null ? 0 : stream!.hashCode);

  @override
  String toString() => 'SubmitToolOutputsRunRequest[toolOutputs=$toolOutputs, stream=$stream]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'tool_outputs'] = this.toolOutputs;
    if (this.stream != null) {
      json[r'stream'] = this.stream;
    } else {
      json[r'stream'] = null;
    }
    return json;
  }

  /// Returns a new [SubmitToolOutputsRunRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SubmitToolOutputsRunRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SubmitToolOutputsRunRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SubmitToolOutputsRunRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SubmitToolOutputsRunRequest(
        toolOutputs: SubmitToolOutputsRunRequestToolOutputsInner.listFromJson(json[r'tool_outputs']),
        stream: mapValueOfType<bool>(json, r'stream'),
      );
    }
    return null;
  }

  static List<SubmitToolOutputsRunRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SubmitToolOutputsRunRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SubmitToolOutputsRunRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SubmitToolOutputsRunRequest> mapFromJson(dynamic json) {
    final map = <String, SubmitToolOutputsRunRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SubmitToolOutputsRunRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SubmitToolOutputsRunRequest-objects as value to a dart map
  static Map<String, List<SubmitToolOutputsRunRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SubmitToolOutputsRunRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SubmitToolOutputsRunRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'tool_outputs',
  };
}

