//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RealtimeClientEventInputAudioBufferClear {
  /// Returns a new [RealtimeClientEventInputAudioBufferClear] instance.
  RealtimeClientEventInputAudioBufferClear({
    this.eventId,
    required this.type,
  });

  /// Optional client-generated ID used to identify this event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? eventId;

  /// The event type, must be `input_audio_buffer.clear`.
  RealtimeClientEventInputAudioBufferClearTypeEnum type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RealtimeClientEventInputAudioBufferClear &&
    other.eventId == eventId &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (eventId == null ? 0 : eventId!.hashCode) +
    (type.hashCode);

  @override
  String toString() => 'RealtimeClientEventInputAudioBufferClear[eventId=$eventId, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.eventId != null) {
      json[r'event_id'] = this.eventId;
    } else {
      json[r'event_id'] = null;
    }
      json[r'type'] = this.type;
    return json;
  }

  /// Returns a new [RealtimeClientEventInputAudioBufferClear] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RealtimeClientEventInputAudioBufferClear? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RealtimeClientEventInputAudioBufferClear[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RealtimeClientEventInputAudioBufferClear[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RealtimeClientEventInputAudioBufferClear(
        eventId: mapValueOfType<String>(json, r'event_id'),
        type: RealtimeClientEventInputAudioBufferClearTypeEnum.fromJson(json[r'type'])!,
      );
    }
    return null;
  }

  static List<RealtimeClientEventInputAudioBufferClear> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventInputAudioBufferClear>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventInputAudioBufferClear.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RealtimeClientEventInputAudioBufferClear> mapFromJson(dynamic json) {
    final map = <String, RealtimeClientEventInputAudioBufferClear>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RealtimeClientEventInputAudioBufferClear.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RealtimeClientEventInputAudioBufferClear-objects as value to a dart map
  static Map<String, List<RealtimeClientEventInputAudioBufferClear>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RealtimeClientEventInputAudioBufferClear>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RealtimeClientEventInputAudioBufferClear.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'type',
  };
}

/// The event type, must be `input_audio_buffer.clear`.
class RealtimeClientEventInputAudioBufferClearTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const RealtimeClientEventInputAudioBufferClearTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const inputAudioBufferPeriodClear = RealtimeClientEventInputAudioBufferClearTypeEnum._(r'input_audio_buffer.clear');

  /// List of all possible values in this [enum][RealtimeClientEventInputAudioBufferClearTypeEnum].
  static const values = <RealtimeClientEventInputAudioBufferClearTypeEnum>[
    inputAudioBufferPeriodClear,
  ];

  static RealtimeClientEventInputAudioBufferClearTypeEnum? fromJson(dynamic value) => RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer().decode(value);

  static List<RealtimeClientEventInputAudioBufferClearTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RealtimeClientEventInputAudioBufferClearTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RealtimeClientEventInputAudioBufferClearTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [RealtimeClientEventInputAudioBufferClearTypeEnum] to String,
/// and [decode] dynamic data back to [RealtimeClientEventInputAudioBufferClearTypeEnum].
class RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer {
  factory RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer() => _instance ??= const RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer._();

  const RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer._();

  String encode(RealtimeClientEventInputAudioBufferClearTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a RealtimeClientEventInputAudioBufferClearTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  RealtimeClientEventInputAudioBufferClearTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'input_audio_buffer.clear': return RealtimeClientEventInputAudioBufferClearTypeEnum.inputAudioBufferPeriodClear;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer] instance.
  static RealtimeClientEventInputAudioBufferClearTypeEnumTypeTransformer? _instance;
}


