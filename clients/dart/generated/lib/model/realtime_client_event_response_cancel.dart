//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventResponseCancel {
  /// Returns a new [RealtimeClientEventResponseCancel] instance.
  RealtimeClientEventResponseCancel({
    this.eventId,
    required this.type,
    this.responseId,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `response.cancel`.
  RealtimeClientEventResponseCancelTypeEnum type;

  /// A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? responseId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventResponseCancel &&
    other.eventId == eventId &&
    other.type == type &&
    other.responseId == responseId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode) +
    (responseId == null ? 0 : responseId!.hashCode);

  @override
  String toString() => 'RealtimeClientEventResponseCancel[eventId=$eventId, type=$type, responseId=$responseId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
    if (this.responseId != null) {
      json[r'response_id'] = this.responseId;
    } else {
      json[r'response_id'] = null;
    }
    return json;
  }

  /// Returns a new [RealtimeClientEventResponseCancel] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventResponseCancel? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeClientEventResponseCancel[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeClientEventResponseCancel[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeClientEventResponseCancel(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventResponseCancelTypeEnum.fromJson(json[r'type'])!,
        responseId: mapValueOfType<String>(json, r'response_id'),
      );
    }
    return null;
  }

  static List<RealtimeClientEventResponseCancel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventResponseCancel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventResponseCancel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventResponseCancel> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventResponseCancel>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventResponseCancel.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventResponseCancel-objects as value to a dart map
  static Map<String, List<RealtimeClientEventResponseCancel>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventResponseCancel>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventResponseCancel.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The event type, must be `response.cancel`.
class RealtimeClientEventResponseCancelTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeClientEventResponseCancelTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const responsePeriodCancel = RealtimeClientEventResponseCancelTypeEnum._(r'response.cancel');

  /// List of all possible values in this [enum][RealtimeClientEventResponseCancelTypeEnum].
  static const values = <RealtimeClientEventResponseCancelTypeEnum>[
    responsePeriodCancel,
  ];

  static RealtimeClientEventResponseCancelTypeEnum? fromJson(dynamic value) => RealtimeClientEventResponseCancelTypeEnumTypeTransformer().decode(value);

  static List<RealtimeClientEventResponseCancelTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventResponseCancelTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventResponseCancelTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventResponseCancelTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventResponseCancelTypeEnum].
class RealtimeClientEventResponseCancelTypeEnumTypeTransformer {
  factory RealtimeClientEventResponseCancelTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventResponseCancelTypeEnumTypeTransformer._();

  const RealtimeClientEventResponseCancelTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventResponseCancelTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeClientEventResponseCancelTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventResponseCancelTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'response.cancel': return RealtimeClientEventResponseCancelTypeEnum.responsePeriodCancel;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeClientEventResponseCancelTypeEnumTypeTransformer] instance.
  static RealtimeClientEventResponseCancelTypeEnumTypeTransformer? _instance;
}


