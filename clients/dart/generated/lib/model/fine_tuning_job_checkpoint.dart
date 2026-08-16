//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuningJobCheckpoint {
  /// Returns a new [FineTuningJobCheckpoint] instance.
  FineTuningJobCheckpoint({
    required this.id,
    required this.createdAt,
    required this.fineTunedModelCheckpoint,
    required this.stepNumber,
    required this.metrics,
    required this.fineTuningJobId,
    required this.object,
  });

  /// The checkpoint identifier, which can be referenced in the API endpoints.
  String id;

  /// The Unix timestamp (in seconds) for when the checkpoint was created.
  int createdAt;

  /// The name of the fine-tuned checkpoint model that is created.
  String fineTunedModelCheckpoint;

  /// The step number that the checkpoint was created at.
  int stepNumber;

  FineTuningJobCheckpointMetrics metrics;

  /// The name of the fine-tuning job that this checkpoint was created from.
  String fineTuningJobId;

  /// The object type, which is always \"fine_tuning.job.checkpoint\".
  FineTuningJobCheckpointObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuningJobCheckpoint &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.fineTunedModelCheckpoint == fineTunedModelCheckpoint &&
    other.stepNumber == stepNumber &&
    other.metrics == metrics &&
    other.fineTuningJobId == fineTuningJobId &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (createdAt.hashCode) +
    (fineTunedModelCheckpoint.hashCode) +
    (stepNumber.hashCode) +
    (metrics.hashCode) +
    (fineTuningJobId.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'FineTuningJobCheckpoint[id=$id, createdAt=$createdAt, fineTunedModelCheckpoint=$fineTunedModelCheckpoint, stepNumber=$stepNumber, metrics=$metrics, fineTuningJobId=$fineTuningJobId, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'created_at'] = this.createdAt;
      json[r'fine_tuned_model_checkpoint'] = this.fineTunedModelCheckpoint;
      json[r'step_number'] = this.stepNumber;
      json[r'metrics'] = this.metrics;
      json[r'fine_tuning_job_id'] = this.fineTuningJobId;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [FineTuningJobCheckpoint] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuningJobCheckpoint? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuningJobCheckpoint[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuningJobCheckpoint[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuningJobCheckpoint(
        id: mapValueOfType<String>(json, r'id')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        fineTunedModelCheckpoint: mapValueOfType<String>(json, r'fine_tuned_model_checkpoint')!,
        stepNumber: mapValueOfType<int>(json, r'step_number')!,
        metrics: FineTuningJobCheckpointMetrics.fromJson(json[r'metrics'])!,
        fineTuningJobId: mapValueOfType<String>(json, r'fine_tuning_job_id')!,
        object: FineTuningJobCheckpointObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<FineTuningJobCheckpoint> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobCheckpoint>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobCheckpoint.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuningJobCheckpoint> mapFromJson(dynamic json) {
    final map = <String, FineTuningJobCheckpoint>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuningJobCheckpoint.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuningJobCheckpoint-objects as value to a dart map
  static Map<String, List<FineTuningJobCheckpoint>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuningJobCheckpoint>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuningJobCheckpoint.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'created_at',
    'fine_tuned_model_checkpoint',
    'step_number',
    'metrics',
    'fine_tuning_job_id',
    'object',
  };
}

/// The object type, which is always \"fine_tuning.job.checkpoint\".
class FineTuningJobCheckpointObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobCheckpointObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fineTuningPeriodJobPeriodCheckpoint = FineTuningJobCheckpointObjectEnum._(r'fine_tuning.job.checkpoint');

  /// List of all possible values in this [enum][FineTuningJobCheckpointObjectEnum].
  static const values = <FineTuningJobCheckpointObjectEnum>[
    fineTuningPeriodJobPeriodCheckpoint,
  ];

  static FineTuningJobCheckpointObjectEnum? fromJson(dynamic value) => FineTuningJobCheckpointObjectEnumTypeTransformer().decode(value);

  static List<FineTuningJobCheckpointObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobCheckpointObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobCheckpointObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobCheckpointObjectEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobCheckpointObjectEnum].
class FineTuningJobCheckpointObjectEnumTypeTransformer {
  factory FineTuningJobCheckpointObjectEnumTypeTransformer() => _instance ??= const FineTuningJobCheckpointObjectEnumTypeTransformer._();

  const FineTuningJobCheckpointObjectEnumTypeTransformer._();

  String encode(FineTuningJobCheckpointObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobCheckpointObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobCheckpointObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'fine_tuning.job.checkpoint': return FineTuningJobCheckpointObjectEnum.fineTuningPeriodJobPeriodCheckpoint;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobCheckpointObjectEnumTypeTransformer] instance.
  static FineTuningJobCheckpointObjectEnumTypeTransformer? _instance;
}


