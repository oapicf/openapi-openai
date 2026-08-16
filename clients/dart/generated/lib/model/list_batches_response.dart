//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ListBatchesResponse {
  /// Returns a new [ListBatchesResponse] instance.
  ListBatchesResponse({
    this.data = const [],
    this.firstId,
    this.lastId,
    required this.hasMore,
    required this.object,
  });

  List<Batch> data;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? firstId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? lastId;

  bool hasMore;

  ListBatchesResponseObjectEnum object;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ListBatchesResponse &&
    _deepEquality.equals(other.data, data) &&
    other.firstId == firstId &&
    other.lastId == lastId &&
    other.hasMore == hasMore &&
    other.object == object;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data.hashCode) +
    (firstId == null ? 0 : firstId!.hashCode) +
    (lastId == null ? 0 : lastId!.hashCode) +
    (hasMore.hashCode) +
    (object.hashCode);

  @override
  String toString() => 'ListBatchesResponse[data=$data, firstId=$firstId, lastId=$lastId, hasMore=$hasMore, object=$object]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'data'] = this.data;
    if (this.firstId != null) {
      json[r'first_id'] = this.firstId;
    } else {
      json[r'first_id'] = null;
    }
    if (this.lastId != null) {
      json[r'last_id'] = this.lastId;
    } else {
      json[r'last_id'] = null;
    }
      json[r'has_more'] = this.hasMore;
      json[r'object'] = this.object;
    return json;
  }

  /// Returns a new [ListBatchesResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ListBatchesResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ListBatchesResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ListBatchesResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ListBatchesResponse(
        data: Batch.listFromJson(json[r'data']),
        firstId: mapValueOfType<String>(json, r'first_id'),
        lastId: mapValueOfType<String>(json, r'last_id'),
        hasMore: mapValueOfType<bool>(json, r'has_more')!,
        object: ListBatchesResponseObjectEnum.fromJson(json[r'object'])!,
      );
    }
    return null;
  }

  static List<ListBatchesResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListBatchesResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListBatchesResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ListBatchesResponse> mapFromJson(dynamic json) {
    final map = <String, ListBatchesResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ListBatchesResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ListBatchesResponse-objects as value to a dart map
  static Map<String, List<ListBatchesResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ListBatchesResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ListBatchesResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'data',
    'has_more',
    'object',
  };
}


class ListBatchesResponseObjectEnum {
  /// Instantiate a new enum with the provided [value].
  const ListBatchesResponseObjectEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const list = ListBatchesResponseObjectEnum._(r'list');

  /// List of all possible values in this [enum][ListBatchesResponseObjectEnum].
  static const values = <ListBatchesResponseObjectEnum>[
    list,
  ];

  static ListBatchesResponseObjectEnum? fromJson(dynamic value) => ListBatchesResponseObjectEnumTypeTransformer().decode(value);

  static List<ListBatchesResponseObjectEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ListBatchesResponseObjectEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ListBatchesResponseObjectEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ListBatchesResponseObjectEnum] to String,
/// and [decode] dynamic data back to [ListBatchesResponseObjectEnum].
class ListBatchesResponseObjectEnumTypeTransformer {
  factory ListBatchesResponseObjectEnumTypeTransformer() => _instance ??= const ListBatchesResponseObjectEnumTypeTransformer._();

  const ListBatchesResponseObjectEnumTypeTransformer._();

  String encode(ListBatchesResponseObjectEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ListBatchesResponseObjectEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ListBatchesResponseObjectEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'list': return ListBatchesResponseObjectEnum.list;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ListBatchesResponseObjectEnumTypeTransformer] instance.
  static ListBatchesResponseObjectEnumTypeTransformer? _instance;
}


