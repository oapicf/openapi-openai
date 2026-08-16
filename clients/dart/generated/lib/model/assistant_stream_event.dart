//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AssistantStreamEvent {
  /// Returns a new [AssistantStreamEvent] instance.
  AssistantStreamEvent({
    this.enabled,
    required this.event,
    required this.data,
  });

  /// Whether to enable input audio transcription.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? enabled;

  AssistantStreamEventEventEnum event;

  AssistantStreamEventDataEnum data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AssistantStreamEvent &&
    other.enabled == enabled &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (enabled == null ? 0 : enabled!.hashCode) +
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'AssistantStreamEvent[enabled=$enabled, event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.enabled != null) {
      json[r'enabled'] = this.enabled;
    } else {
      json[r'enabled'] = null;
    }
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [AssistantStreamEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AssistantStreamEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AssistantStreamEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AssistantStreamEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AssistantStreamEvent(
        enabled: mapValueOfType<bool>(json, r'enabled'),
        event: AssistantStreamEventEventEnum.fromJson(json[r'event'])!,
        data: AssistantStreamEventDataEnum.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<AssistantStreamEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantStreamEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantStreamEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AssistantStreamEvent> mapFromJson(dynamic json) {
    final map = <String, AssistantStreamEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AssistantStreamEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AssistantStreamEvent-objects as value to a dart map
  static Map<String, List<AssistantStreamEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AssistantStreamEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AssistantStreamEvent.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'event',
    'data',
  };
}


class AssistantStreamEventEventEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantStreamEventEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const done = AssistantStreamEventEventEnum._(r'done');

  /// List of all possible values in this [enum][AssistantStreamEventEventEnum].
  static const values = <AssistantStreamEventEventEnum>[
    done,
  ];

  static AssistantStreamEventEventEnum? fromJson(dynamic value) => AssistantStreamEventEventEnumTypeTransformer().decode(value);

  static List<AssistantStreamEventEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantStreamEventEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantStreamEventEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantStreamEventEventEnum] to String,
/// and [decode] dynamic data back to [AssistantStreamEventEventEnum].
class AssistantStreamEventEventEnumTypeTransformer {
  factory AssistantStreamEventEventEnumTypeTransformer() => _instance ??= const AssistantStreamEventEventEnumTypeTransformer._();

  const AssistantStreamEventEventEnumTypeTransformer._();

  String encode(AssistantStreamEventEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantStreamEventEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantStreamEventEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'done': return AssistantStreamEventEventEnum.done;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantStreamEventEventEnumTypeTransformer] instance.
  static AssistantStreamEventEventEnumTypeTransformer? _instance;
}



class AssistantStreamEventDataEnum {
  /// Instantiate a new enum with the provided [value].
  const AssistantStreamEventDataEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const leftSquareBracketDONERightSquareBracket = AssistantStreamEventDataEnum._(r'[DONE]');

  /// List of all possible values in this [enum][AssistantStreamEventDataEnum].
  static const values = <AssistantStreamEventDataEnum>[
    leftSquareBracketDONERightSquareBracket,
  ];

  static AssistantStreamEventDataEnum? fromJson(dynamic value) => AssistantStreamEventDataEnumTypeTransformer().decode(value);

  static List<AssistantStreamEventDataEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssistantStreamEventDataEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssistantStreamEventDataEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssistantStreamEventDataEnum] to String,
/// and [decode] dynamic data back to [AssistantStreamEventDataEnum].
class AssistantStreamEventDataEnumTypeTransformer {
  factory AssistantStreamEventDataEnumTypeTransformer() => _instance ??= const AssistantStreamEventDataEnumTypeTransformer._();

  const AssistantStreamEventDataEnumTypeTransformer._();

  String encode(AssistantStreamEventDataEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AssistantStreamEventDataEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssistantStreamEventDataEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'[DONE]': return AssistantStreamEventDataEnum.leftSquareBracketDONERightSquareBracket;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AssistantStreamEventDataEnumTypeTransformer] instance.
  static AssistantStreamEventDataEnumTypeTransformer? _instance;
}


