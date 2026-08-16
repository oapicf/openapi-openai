//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuningJobCheckpointMetrics {
  /// Returns a new [FineTuningJobCheckpointMetrics] instance.
  FineTuningJobCheckpointMetrics({
    this.step,
    this.trainLoss,
    this.trainMeanTokenAccuracy,
    this.validLoss,
    this.validMeanTokenAccuracy,
    this.fullValidLoss,
    this.fullValidMeanTokenAccuracy,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? step;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? trainLoss;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? trainMeanTokenAccuracy;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? validLoss;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? validMeanTokenAccuracy;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? fullValidLoss;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? fullValidMeanTokenAccuracy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuningJobCheckpointMetrics &&
    other.step == step &&
    other.trainLoss == trainLoss &&
    other.trainMeanTokenAccuracy == trainMeanTokenAccuracy &&
    other.validLoss == validLoss &&
    other.validMeanTokenAccuracy == validMeanTokenAccuracy &&
    other.fullValidLoss == fullValidLoss &&
    other.fullValidMeanTokenAccuracy == fullValidMeanTokenAccuracy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (step == null ? 0 : step!.hashCode) +
    (trainLoss == null ? 0 : trainLoss!.hashCode) +
    (trainMeanTokenAccuracy == null ? 0 : trainMeanTokenAccuracy!.hashCode) +
    (validLoss == null ? 0 : validLoss!.hashCode) +
    (validMeanTokenAccuracy == null ? 0 : validMeanTokenAccuracy!.hashCode) +
    (fullValidLoss == null ? 0 : fullValidLoss!.hashCode) +
    (fullValidMeanTokenAccuracy == null ? 0 : fullValidMeanTokenAccuracy!.hashCode);

  @override
  String toString() => 'FineTuningJobCheckpointMetrics[step=$step, trainLoss=$trainLoss, trainMeanTokenAccuracy=$trainMeanTokenAccuracy, validLoss=$validLoss, validMeanTokenAccuracy=$validMeanTokenAccuracy, fullValidLoss=$fullValidLoss, fullValidMeanTokenAccuracy=$fullValidMeanTokenAccuracy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.step != null) {
      json[r'step'] = this.step;
    } else {
      json[r'step'] = null;
    }
    if (this.trainLoss != null) {
      json[r'train_loss'] = this.trainLoss;
    } else {
      json[r'train_loss'] = null;
    }
    if (this.trainMeanTokenAccuracy != null) {
      json[r'train_mean_token_accuracy'] = this.trainMeanTokenAccuracy;
    } else {
      json[r'train_mean_token_accuracy'] = null;
    }
    if (this.validLoss != null) {
      json[r'valid_loss'] = this.validLoss;
    } else {
      json[r'valid_loss'] = null;
    }
    if (this.validMeanTokenAccuracy != null) {
      json[r'valid_mean_token_accuracy'] = this.validMeanTokenAccuracy;
    } else {
      json[r'valid_mean_token_accuracy'] = null;
    }
    if (this.fullValidLoss != null) {
      json[r'full_valid_loss'] = this.fullValidLoss;
    } else {
      json[r'full_valid_loss'] = null;
    }
    if (this.fullValidMeanTokenAccuracy != null) {
      json[r'full_valid_mean_token_accuracy'] = this.fullValidMeanTokenAccuracy;
    } else {
      json[r'full_valid_mean_token_accuracy'] = null;
    }
    return json;
  }

  /// Returns a new [FineTuningJobCheckpointMetrics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuningJobCheckpointMetrics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuningJobCheckpointMetrics[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuningJobCheckpointMetrics[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuningJobCheckpointMetrics(
        step: num.parse('${json[r'step']}'),
        trainLoss: num.parse('${json[r'train_loss']}'),
        trainMeanTokenAccuracy: num.parse('${json[r'train_mean_token_accuracy']}'),
        validLoss: num.parse('${json[r'valid_loss']}'),
        validMeanTokenAccuracy: num.parse('${json[r'valid_mean_token_accuracy']}'),
        fullValidLoss: num.parse('${json[r'full_valid_loss']}'),
        fullValidMeanTokenAccuracy: num.parse('${json[r'full_valid_mean_token_accuracy']}'),
      );
    }
    return null;
  }

  static List<FineTuningJobCheckpointMetrics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobCheckpointMetrics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobCheckpointMetrics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuningJobCheckpointMetrics> mapFromJson(dynamic json) {
    final map = <String, FineTuningJobCheckpointMetrics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuningJobCheckpointMetrics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuningJobCheckpointMetrics-objects as value to a dart map
  static Map<String, List<FineTuningJobCheckpointMetrics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuningJobCheckpointMetrics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuningJobCheckpointMetrics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

