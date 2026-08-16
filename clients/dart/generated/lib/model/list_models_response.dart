//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListModelsResponse {
  /// Returns a new [ListModelsResponse] instance.
  ListModelsResponse({
    required this.object,
    this.data = const [],
  });

  ListModelsResponseObjectEnum object;

  List<Model> data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListModelsResponse &&
    other.object == object &&
    _deepEquality.equals(other.data, data);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (object.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'ListModelsResponse[object=$object, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'object'] = this.object;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [ListModelsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListModelsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListModelsResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListModelsResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListModelsResponse(
        object: ListModelsResponseObjectEnum.fromJson(json[r'object'])!,
        data: Model.listFromJson(json[r'data']),
      );
    }
    return null;
  }

  static List<ListModelsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListModelsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListModelsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListModelsResponse> mapFromJson(dynamic json) {
    final map = <String, ListModelsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListModelsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListModelsResponse-objects as value to a dart map
  static Map<String, List<ListModelsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListModelsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListModelsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'object',
    'data',
  };
}


class ListModelsResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ListModelsResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ListModelsResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ListModelsResponseObjectEnum].
  static const values = <ListModelsResponseObjectEnum>[
    list,
  ];

  static ListModelsResponseObjectEnum? fromJson(dynamic value) => ListModelsResponseObjectEnumTypeTransformer().decode(value);

  static List<ListModelsResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListModelsResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListModelsResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ListModelsResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ListModelsResponseObjectEnum].
class ListModelsResponseObjectEnumTypeTransformer {
  factory ListModelsResponseObjectEnumTypeTransformer() => _instance ??= const ListModelsResponseObjectEnumTypeTransformer._();

  const ListModelsResponseObjectEnumTypeTransformer._();

  String encode(ListModelsResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ListModelsResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ListModelsResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ListModelsResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ListModelsResponseObjectEnumTypeTransformer] instance.
  static ListModelsResponseObjectEnumTypeTransformer? _instance;
}


