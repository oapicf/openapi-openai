//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FineTuningJobEvent {
  /// Returns a new [FineTuningJobEvent] instance.
  FineTuningJobEvent({
    required this.object,
    required this.id,
    required this.createdAt,
    required this.level,
    required this.message,
    this.type,
    this.data,
  });

  /// The object type, which is always \"fine_tuning.job.event\".
  FineTuningJobEventObjectEnum object;

  /// The object identifier.
  String id;

  /// The Unix timestamp (in seconds) for when the fine-tuning job was created.
  int createdAt;

  /// The log level of the event.
  FineTuningJobEventLevelEnum level;

  /// The message of the event.
  String message;

  /// The type of event.
  FineTuningJobEventTypeEnum? type;

  /// The data associated with the event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FineTuningJobEvent &&
    other.object == object &&
    other.id == id &&
    other.createdAt == createdAt &&
    other.level == level &&
    other.message == message &&
    other.type == type &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (id.hashCode) +
    (createdAt.hashCode) +
    (level.hashCode) +
    (message.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (data == null ? 0 : data!.hashCode);

  @override
  String toString() => 'FineTuningJobEvent[object=$object, id=$id, createdAt=$createdAt, level=$level, message=$message, type=$type, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'id'] = this.id;
      json[r'created_at'] = this.createdAt;
      json[r'level'] = this.level;
      json[r'message'] = this.message;
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
    return json;
  }

  /// Returns a new [FineTuningJobEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FineTuningJobEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FineTuningJobEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FineTuningJobEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FineTuningJobEvent(
        object: FineTuningJobEventObjectEnum.fromJson(json[r'object'])!,
        id: mapValueOfType<String>(json, r'id')!,
        createdAt: mapValueOfType<int>(json, r'created_at')!,
        level: FineTuningJobEventLevelEnum.fromJson(json[r'level'])!,
        message: mapValueOfType<String>(json, r'message')!,
        type: FineTuningJobEventTypeEnum.fromJson(json[r'type']),
        data: mapValueOfType<Object>(json, r'data'),
      );
    }
    return null;
  }

  static List<FineTuningJobEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FineTuningJobEvent> mapFromJson(dynamic json) {
    final map = <String, FineTuningJobEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FineTuningJobEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FineTuningJobEvent-objects as value to a dart map
  static Map<String, List<FineTuningJobEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FineTuningJobEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FineTuningJobEvent.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'id',
    'created_at',
    'level',
    'message',
  };
}

/// The object type, which is always \"fine_tuning.job.event\".
class FineTuningJobEventObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobEventObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const fineTuningPeriodJobPeriodEvent = FineTuningJobEventObjectEnum._(r'fine_tuning.job.event');

  /// List of all possible values in this [enum][FineTuningJobEventObjectEnum].
  static const values = <FineTuningJobEventObjectEnum>[
    fineTuningPeriodJobPeriodEvent,
  ];

  static FineTuningJobEventObjectEnum? fromJson(dynamic value) => FineTuningJobEventObjectEnumTypeTransformer().decode(value);

  static List<FineTuningJobEventObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobEventObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobEventObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobEventObjectEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobEventObjectEnum].
class FineTuningJobEventObjectEnumTypeTransformer {
  factory FineTuningJobEventObjectEnumTypeTransformer() => _instance ??= const FineTuningJobEventObjectEnumTypeTransformer._();

  const FineTuningJobEventObjectEnumTypeTransformer._();

  String encode(FineTuningJobEventObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobEventObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobEventObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'fine_tuning.job.event': return FineTuningJobEventObjectEnum.fineTuningPeriodJobPeriodEvent;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobEventObjectEnumTypeTransformer] instance.
  static FineTuningJobEventObjectEnumTypeTransformer? _instance;
}


/// The log level of the event.
class FineTuningJobEventLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobEventLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const info = FineTuningJobEventLevelEnum._(r'info');
  static const warn = FineTuningJobEventLevelEnum._(r'warn');
  static const error = FineTuningJobEventLevelEnum._(r'error');

  /// List of all possible values in this [enum][FineTuningJobEventLevelEnum].
  static const values = <FineTuningJobEventLevelEnum>[
    info,
    warn,
    error,
  ];

  static FineTuningJobEventLevelEnum? fromJson(dynamic value) => FineTuningJobEventLevelEnumTypeTransformer().decode(value);

  static List<FineTuningJobEventLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobEventLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobEventLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobEventLevelEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobEventLevelEnum].
class FineTuningJobEventLevelEnumTypeTransformer {
  factory FineTuningJobEventLevelEnumTypeTransformer() => _instance ??= const FineTuningJobEventLevelEnumTypeTransformer._();

  const FineTuningJobEventLevelEnumTypeTransformer._();

  String encode(FineTuningJobEventLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobEventLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobEventLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'info': return FineTuningJobEventLevelEnum.info;
        case r'warn': return FineTuningJobEventLevelEnum.warn;
        case r'error': return FineTuningJobEventLevelEnum.error;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobEventLevelEnumTypeTransformer] instance.
  static FineTuningJobEventLevelEnumTypeTransformer? _instance;
}


/// The type of event.
class FineTuningJobEventTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const FineTuningJobEventTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const message = FineTuningJobEventTypeEnum._(r'message');
  static const metrics = FineTuningJobEventTypeEnum._(r'metrics');

  /// List of all possible values in this [enum][FineTuningJobEventTypeEnum].
  static const values = <FineTuningJobEventTypeEnum>[
    message,
    metrics,
  ];

  static FineTuningJobEventTypeEnum? fromJson(dynamic value) => FineTuningJobEventTypeEnumTypeTransformer().decode(value);

  static List<FineTuningJobEventTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FineTuningJobEventTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FineTuningJobEventTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [FineTuningJobEventTypeEnum] to String,
/// and [decode] dynamic data back to [FineTuningJobEventTypeEnum].
class FineTuningJobEventTypeEnumTypeTransformer {
  factory FineTuningJobEventTypeEnumTypeTransformer() => _instance ??= const FineTuningJobEventTypeEnumTypeTransformer._();

  const FineTuningJobEventTypeEnumTypeTransformer._();

  String encode(FineTuningJobEventTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a FineTuningJobEventTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  FineTuningJobEventTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'message': return FineTuningJobEventTypeEnum.message;
        case r'metrics': return FineTuningJobEventTypeEnum.metrics;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [FineTuningJobEventTypeEnumTypeTransformer] instance.
  static FineTuningJobEventTypeEnumTypeTransformer? _instance;
}


