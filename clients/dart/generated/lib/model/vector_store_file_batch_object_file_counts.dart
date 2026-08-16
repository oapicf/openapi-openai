//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VectorStoreFileBatchObjectFileCounts {
  /// Returns a new [VectorStoreFileBatchObjectFileCounts] instance.
  VectorStoreFileBatchObjectFileCounts({
    required this.inProgress,
    required this.completed,
    required this.failed,
    required this.cancelled,
    required this.total,
  });

  /// The number of files that are currently being processed.
  int inProgress;

  /// The number of files that have been processed.
  int completed;

  /// The number of files that have failed to process.
  int failed;

  /// The number of files that where cancelled.
  int cancelled;

  /// The total number of files.
  int total;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VectorStoreFileBatchObjectFileCounts &&
    other.inProgress == inProgress &&
    other.completed == completed &&
    other.failed == failed &&
    other.cancelled == cancelled &&
    other.total == total;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inProgress.hashCode) +
    (completed.hashCode) +
    (failed.hashCode) +
    (cancelled.hashCode) +
    (total.hashCode);

  @override
  String toString() => 'VectorStoreFileBatchObjectFileCounts[inProgress=$inProgress, completed=$completed, failed=$failed, cancelled=$cancelled, total=$total]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'in_progress'] = this.inProgress;
      json[r'completed'] = this.completed;
      json[r'failed'] = this.failed;
      json[r'cancelled'] = this.cancelled;
      json[r'total'] = this.total;
    return json;
  }

  /// Returns a new [VectorStoreFileBatchObjectFileCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VectorStoreFileBatchObjectFileCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VectorStoreFileBatchObjectFileCounts[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VectorStoreFileBatchObjectFileCounts[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VectorStoreFileBatchObjectFileCounts(
        inProgress: mapValueOfType<int>(json, r'in_progress')!,
        completed: mapValueOfType<int>(json, r'completed')!,
        failed: mapValueOfType<int>(json, r'failed')!,
        cancelled: mapValueOfType<int>(json, r'cancelled')!,
        total: mapValueOfType<int>(json, r'total')!,
      );
    }
    return null;
  }

  static List<VectorStoreFileBatchObjectFileCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VectorStoreFileBatchObjectFileCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VectorStoreFileBatchObjectFileCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VectorStoreFileBatchObjectFileCounts> mapFromJson(dynamic json) {
    final map = <String, VectorStoreFileBatchObjectFileCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VectorStoreFileBatchObjectFileCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VectorStoreFileBatchObjectFileCounts-objects as value to a dart map
  static Map<String, List<VectorStoreFileBatchObjectFileCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VectorStoreFileBatchObjectFileCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VectorStoreFileBatchObjectFileCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'in_progress',
    'completed',
    'failed',
    'cancelled',
    'total',
  };
}

