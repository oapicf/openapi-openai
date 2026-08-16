//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ErrorEvent {
  /// Returns a new [ErrorEvent] instance.
  ErrorEvent({
    required this.event,
    required this.data,
  });

  ErrorEventEventEnum event;

  Error data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ErrorEvent &&
    other.event == event &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (event.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'ErrorEvent[event=$event, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'event'] = this.event;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [ErrorEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ErrorEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ErrorEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ErrorEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ErrorEvent(
        event: ErrorEventEventEnum.fromJson(json[r'event'])!,
        data: Error.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<ErrorEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ErrorEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ErrorEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ErrorEvent> mapFromJson(dynamic json) {
    final map = <String, ErrorEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ErrorEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ErrorEvent-objects as value to a dart map
  static Map<String, List<ErrorEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ErrorEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ErrorEvent.listFromJson(entry.value, growable: growable,);
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


class ErrorEventEventEnum {
  /// Instantiate a new enum with the provided [value].
  const ErrorEventEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const error = ErrorEventEventEnum._(r'error');

  /// List of all possible values in this [enum][ErrorEventEventEnum].
  static const values = <ErrorEventEventEnum>[
    error,
  ];

  static ErrorEventEventEnum? fromJson(dynamic value) => ErrorEventEventEnumTypeTransformer().decode(value);

  static List<ErrorEventEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ErrorEventEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ErrorEventEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ErrorEventEventEnum] to String,
/// and [decode] dynamic data back to [ErrorEventEventEnum].
class ErrorEventEventEnumTypeTransformer {
  factory ErrorEventEventEnumTypeTransformer() => _instance ??= const ErrorEventEventEnumTypeTransformer._();

  const ErrorEventEventEnumTypeTransformer._();

  String encode(ErrorEventEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ErrorEventEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ErrorEventEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'error': return ErrorEventEventEnum.error;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ErrorEventEventEnumTypeTransformer] instance.
  static ErrorEventEventEnumTypeTransformer? _instance;
}


