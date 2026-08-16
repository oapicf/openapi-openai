//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BatchRequestCounts {
  /// Returns a new [BatchRequestCounts] instance.
  BatchRequestCounts({
    required this.total,
    required this.completed,
    required this.failed,
  });

  /// Total number of requests in the batch.
  int total;

  /// Number of requests that have been completed successfully.
  int completed;

  /// Number of requests that have failed.
  int failed;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BatchRequestCounts &&
    other.total == total &&
    other.completed == completed &&
    other.failed == failed;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (total.hashCode) +
    (completed.hashCode) +
    (failed.hashCode);

  @override
  String toString() => 'BatchRequestCounts[total=$total, completed=$completed, failed=$failed]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'total'] = this.total;
      json[r'completed'] = this.completed;
      json[r'failed'] = this.failed;
    return json;
  }

  /// Returns a new [BatchRequestCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BatchRequestCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BatchRequestCounts[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BatchRequestCounts[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BatchRequestCounts(
        total: mapValueOfType<int>(json, r'total')!,
        completed: mapValueOfType<int>(json, r'completed')!,
        failed: mapValueOfType<int>(json, r'failed')!,
      );
    }
    return null;
  }

  static List<BatchRequestCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BatchRequestCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BatchRequestCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BatchRequestCounts> mapFromJson(dynamic json) {
    final map = <String, BatchRequestCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BatchRequestCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BatchRequestCounts-objects as value to a dart map
  static Map<String, List<BatchRequestCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BatchRequestCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BatchRequestCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'total',
    'completed',
    'failed',
  };
}

