//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DoneEvent {
  /// Returns a new [DoneEvent] instance.
  DoneEvent({
    required this.event,
    required this.data,
  });

  DoneEventEventEnum event;

  DoneEventDataEnum data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DoneEvent &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'DoneEvent[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [DoneEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DoneEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DoneEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DoneEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DoneEvent(
        event: DoneEventEventEnum.fromJson(json[r'event'])!,
        data: DoneEventDataEnum.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<DoneEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DoneEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DoneEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DoneEvent> mapFromJson(dynamic json) {
    final map = <String, DoneEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DoneEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DoneEvent-objects as value to a dart map
  static Map<String, List<DoneEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DoneEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DoneEvent.listFromJson(entry.value, growable: growable,);
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


class DoneEventEventEnum {
  /// Instantiate a new enum with the provided [value].
  const DoneEventEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const done = DoneEventEventEnum._(r'done');

  /// List of all possible values in this [enum][DoneEventEventEnum].
  static const values = <DoneEventEventEnum>[
    done,
  ];

  static DoneEventEventEnum? fromJson(dynamic value) => DoneEventEventEnumTypeTransformer().decode(value);

  static List<DoneEventEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DoneEventEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DoneEventEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DoneEventEventEnum] to String,
/// and [decode] dynamic data back to [DoneEventEventEnum].
class DoneEventEventEnumTypeTransformer {
  factory DoneEventEventEnumTypeTransformer() => _instance ??= const DoneEventEventEnumTypeTransformer._();

  const DoneEventEventEnumTypeTransformer._();

  String encode(DoneEventEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DoneEventEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DoneEventEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'done': return DoneEventEventEnum.done;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DoneEventEventEnumTypeTransformer] instance.
  static DoneEventEventEnumTypeTransformer? _instance;
}



class DoneEventDataEnum {
  /// Instantiate a new enum with the provided [value].
  const DoneEventDataEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const leftSquareBracketDONERightSquareBracket = DoneEventDataEnum._(r'[DONE]');

  /// List of all possible values in this [enum][DoneEventDataEnum].
  static const values = <DoneEventDataEnum>[
    leftSquareBracketDONERightSquareBracket,
  ];

  static DoneEventDataEnum? fromJson(dynamic value) => DoneEventDataEnumTypeTransformer().decode(value);

  static List<DoneEventDataEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DoneEventDataEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DoneEventDataEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DoneEventDataEnum] to String,
/// and [decode] dynamic data back to [DoneEventDataEnum].
class DoneEventDataEnumTypeTransformer {
  factory DoneEventDataEnumTypeTransformer() => _instance ??= const DoneEventDataEnumTypeTransformer._();

  const DoneEventDataEnumTypeTransformer._();

  String encode(DoneEventDataEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a DoneEventDataEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DoneEventDataEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'[DONE]': return DoneEventDataEnum.leftSquareBracketDONERightSquareBracket;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DoneEventDataEnumTypeTransformer] instance.
  static DoneEventDataEnumTypeTransformer? _instance;
}


