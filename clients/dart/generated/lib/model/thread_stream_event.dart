//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ThreadStreamEvent {
  /// Returns a new [ThreadStreamEvent] instance.
  ThreadStreamEvent({
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

  ThreadStreamEventEventEnum event;

  ThreadObject data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ThreadStreamEvent &&
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
  String toString() => 'ThreadStreamEvent[enabled=$enabled, event=$event, data=$data]';

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

  /// Returns a new [ThreadStreamEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ThreadStreamEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ThreadStreamEvent[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ThreadStreamEvent[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ThreadStreamEvent(
        enabled: mapValueOfType<bool>(json, r'enabled'),
        event: ThreadStreamEventEventEnum.fromJson(json[r'event'])!,
        data: ThreadObject.fromJson(json[r'data'])!,
      );
    }
    return null;
  }

  static List<ThreadStreamEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ThreadStreamEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ThreadStreamEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ThreadStreamEvent> mapFromJson(dynamic json) {
    final map = <String, ThreadStreamEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ThreadStreamEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ThreadStreamEvent-objects as value to a dart map
  static Map<String, List<ThreadStreamEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ThreadStreamEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ThreadStreamEvent.listFromJson(entry.value, growable: growable,);
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


class ThreadStreamEventEventEnum {
  /// Instantiate a new enum with the provided [value].
  const ThreadStreamEventEventEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const threadPeriodCreated = ThreadStreamEventEventEnum._(r'thread.created');

  /// List of all possible values in this [enum][ThreadStreamEventEventEnum].
  static const values = <ThreadStreamEventEventEnum>[
    threadPeriodCreated,
  ];

  static ThreadStreamEventEventEnum? fromJson(dynamic value) => ThreadStreamEventEventEnumTypeTransformer().decode(value);

  static List<ThreadStreamEventEventEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ThreadStreamEventEventEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ThreadStreamEventEventEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ThreadStreamEventEventEnum] to String,
/// and [decode] dynamic data back to [ThreadStreamEventEventEnum].
class ThreadStreamEventEventEnumTypeTransformer {
  factory ThreadStreamEventEventEnumTypeTransformer() => _instance ??= const ThreadStreamEventEventEnumTypeTransformer._();

  const ThreadStreamEventEventEnumTypeTransformer._();

  String encode(ThreadStreamEventEventEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ThreadStreamEventEventEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ThreadStreamEventEventEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'thread.created': return ThreadStreamEventEventEnum.threadPeriodCreated;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ThreadStreamEventEventEnumTypeTransformer] instance.
  static ThreadStreamEventEventEnumTypeTransformer? _instance;
}


